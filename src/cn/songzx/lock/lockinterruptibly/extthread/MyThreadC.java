/**   
* @Title: MyThreadC.java 
* @Package cn.songzx.lock.lockinterruptibly.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����9:39:41 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.extthread;

import cn.songzx.lock.lockinterruptibly.service.MyServiceC;

/**
 * @ClassName: MyThreadC
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����9:39:41
 * 
 */
public class MyThreadC extends Thread {
	private MyServiceC service;

	/**
	 * @Date: 2017��9��16������9:40:05
	 * @Title: MyThreadC.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyThreadC(MyServiceC service) {
		super();
		this.service = service;
	}

	public void run() {
		service.waitMethod();
	}
}
