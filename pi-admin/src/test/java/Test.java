import com.pi.admin.AdminApiApplication;
import com.pi.admin.service.DateUtils;
import com.pi.admin.service.impl.MemberSSOAService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Gturn
 * @Title: Test
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2020/6/8 14:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdminApiApplication.class)
public class Test {

    @Autowired
    private MemberSSOAService memberSSOAService;
    @org.junit.Test
    public void proccess() throws InterruptedException {
        Date parse = parse("2020-4-12", "yyyy-MM-dd");
        Long interval = null;
        try {
            interval = getInterval(parse, new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(interval);
        memberSSOAService.pushCommissionFlow(interval.intValue()+1+"",interval.toString());
        memberSSOAService.pushCommissionWithdrawalFlow(interval.intValue()+1+"",interval.toString());
        memberSSOAService.pushCommissionUsedTicketInfo(parse);
    }

    public Date parse(String date, String patter) {
        SimpleDateFormat sdf = new SimpleDateFormat(patter);
        Date dates = null;

        try {
            dates = sdf.parse(date);
            return dates;
        } catch (ParseException var5) {
            System.out.println(var5);
            return dates;
        }
    }

    public Long getInterval(Date begin_date, Date end_date) throws Exception {
        Long day = 0L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        if (begin_date != null) {
            String begin = sdf.format(begin_date);
            begin_date = sdf.parse(begin);
        }
        if (end_date != null) {
            String end = sdf.format(end_date);
            end_date = sdf.parse(end);
        }
        day = (end_date.getTime() - begin_date.getTime()) / (24 * 60 * 60 * 1000);
        return day;
    }
}
