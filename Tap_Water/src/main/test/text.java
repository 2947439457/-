import com.zhibang.mapper.sy.MetertypeMapper;
import com.zhibang.model.SyMetertype;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName text.java
 * @Description TODO
 * @createTime 2020年12月15日 09:54:00
 */
public class text {


    public MetertypeMapper metertypeMapper;

    @Before
    public void a(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        metertypeMapper = context.getBean("metertypeMapper", MetertypeMapper.class);
    }

    @Test
    public void Show(){
        System.out.println(metertypeMapper);
        List<SyMetertype> syMetertypes = metertypeMapper.selectSyMetertype();
        System.out.println(syMetertypes);

    }

}
