/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.lock.reentrantreadwritelock.first.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����10:11:39 
* @version V1.0   
*/
package cn.songzx.lock.reentrantreadwritelock.first.extthread;

import cn.songzx.lock.reentrantreadwritelock.first.service.MyFirstSerivce;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����10:11:39
 * 
 */
public class MyFirstThreadA extends Thread {
	private MyFirstSerivce service;

	/**
	 * @Date: 2017��9��16������10:12:16
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyFirstThreadA(MyFirstSerivce service) {
		super();
		this.service = service;
	}

	public void run() {
		service.read();
		service.write();
	}
}
