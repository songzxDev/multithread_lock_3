/**   
* @Title: MyThreadD.java 
* @Package cn.songzx.lock.lockinterruptibly.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����9:40:38 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.extthread;

import cn.songzx.lock.lockinterruptibly.service.MyServiceC;

/**
 * @ClassName: MyThreadD
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����9:40:38
 * 
 */
public class MyThreadD extends Thread {
	private MyServiceC service;

	/**
	 * @Date: 2017��9��16������9:41:19
	 * @Title: MyThreadD.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyThreadD(MyServiceC service) {
		super();
		this.service = service;
	}

	public void run() {
		service.notifyMethod();
	}

}
