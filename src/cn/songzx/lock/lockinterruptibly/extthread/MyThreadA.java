/**   
* @Title: MyThreadA.java 
* @Package cn.songzx.lock.lockinterruptibly.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����9:06:30 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.extthread;

import cn.songzx.lock.lockinterruptibly.service.MyServiceB;

/**
 * @ClassName: MyThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����9:06:30
 * 
 */
public class MyThreadA extends Thread {

	private MyServiceB service;

	/**
	 * @Date: 2017��9��16������9:07:27
	 * @Title: MyThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyThreadA(MyServiceB service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}
