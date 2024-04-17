package com.yupi.springbootinit.workmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 *  创建测试程序用到的交换机和队列(只用在程序启动前执行一次)
 */
public class YuanBiInitMain {
    public static void main(String[] args) {

        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            //定义交换机
            String EXCHANGE_NAME = BiMqConstant.BI_EXCHANGE_NAME;
            channel.exchangeDeclare(EXCHANGE_NAME,"direct");
            //创建消息队列
            String QUEUE_NAME = BiMqConstant.BI_QUEUE_NAME;
            channel.queueDeclare(QUEUE_NAME,true,false,false,null);
            channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,BiMqConstant.BI_ROUTING_KEY);
        } catch(Exception e){

        }


    }

}
