package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.springbootinit.model.entity.User;
import generator.service.UserService;
import com.yupi.springbootinit.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 狂战士
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-04-12 12:24:25
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




