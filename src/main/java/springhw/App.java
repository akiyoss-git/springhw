package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans.HelloBean;
import springhw.beans.PrinterBean;


public class App {

	public static void main(String[] args) {
		// Создаем контекст приложения из xml файла("src/main/resources/applicationContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Считываем бин (объект)
        HelloBean hb = ctx.getBean("firstBean", HelloBean.class);
        PrinterBean printer = ctx.getBean("printerBean", PrinterBean.class);
        // Печатаем объект в консоль
        printer.print(hb);
        // Закрываем контекст приложения 
        ctx.close();
	}

}
