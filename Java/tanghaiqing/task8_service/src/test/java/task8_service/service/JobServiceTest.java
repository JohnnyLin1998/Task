package task8_service.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import task8_service.pojo.Job;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@ContextConfiguration(locations = "classpath:spring-servlet.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JobServiceTest {
    @Resource(name = "jobServiceImpl")
    private JobService jobSerrvice;


    @Test
    public void queryService() {
        List<Job> jobs =jobSerrvice.queryService("后端开发");
        for(Job job:jobs){
            System.out.println(job);
        }
    }
}