<<<<<<< HEAD:ssh0605/src/com/ru/javadesign/designmodel/flyweightpattern/ReportManagerFactory.java
package com.ru.javadesign.designmodel.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：ssh0605
 * 类描述：享元模式是为数不多的只为提高系统性能而生的设计模式。它的主要作用是复用大对象，节省内存空间和创建对象的时间
 * 创建人：ru
 * 创建时间：2013-8-5 下午03:26:27
 * 修改人：ru
 * 修改时间：2013-8-5 下午03:26:27
 * 修改备注：
 * @since  jdk1.7
 * @version 1.0
 */
public class ReportManagerFactory {
	Map<String, ReportManagerInter> financialReportManager = 
		new HashMap<String, ReportManagerInter>();
	Map<String, ReportManagerInter> employeeReportManager = 
		new HashMap<String, ReportManagerInter>();
	
	public ReportManagerInter getFinancialReportManager(String num){
		ReportManagerInter rmi = financialReportManager.get("num");
		if(rmi == null){
			rmi = new FinacialReportManager(num);
			financialReportManager.put(num, rmi);
		}
		return rmi;
	}
	
	public ReportManagerInter getEmployeeReportManager(String num){
		ReportManagerInter rmi = employeeReportManager.get(num);
		if(rmi == null){
			rmi = new EmployeeReportManager(num);
			employeeReportManager.put(num, rmi);
		}
		return rmi;
	}
}
=======
package com.ru.javadesign.designmodel.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：ssh0605
 * 类描述：享元模式是为数不多的只为提高系统性能而生的设计模式。它的主要作用是复用大对象，节省内存空间和创建对象的时间
 * 创建人：ru
 * 创建时间：2013-8-5 下午03:26:27
 * 修改人：ru
 * 修改时间：2013-8-5 下午03:26:27
 * 修改备注：
 * @since  jdk1.7
 * @version 1.0
 */
public class ReportManagerFactory {
	Map<String, ReportManagerInter> financialReportManager = 
		new HashMap<String, ReportManagerInter>();
	Map<String, ReportManagerInter> employeeReportManager = 
		new HashMap<String, ReportManagerInter>();
	
	public ReportManagerInter getFinancialReportManager(String num){
		ReportManagerInter rmi = financialReportManager.get("num");
		if(rmi == null){
			rmi = new FinacialReportManager(num);
			financialReportManager.put(num, rmi);
		}
		return rmi;
	}
	
	public ReportManagerInter getEmployeeReportManager(String num){
		ReportManagerInter rmi = employeeReportManager.get(num);
		if(rmi == null){
			rmi = new EmployeeReportManager(num);
			employeeReportManager.put(num, rmi);
		}
		return rmi;
	}
}
>>>>>>> 8746882eb916b8be69942e0e22330d5564c04012:ssh0605/src/com/ru/javadesign/designmodel/flyweightpattern/ReportManagerFactory.java
