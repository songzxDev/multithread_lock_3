/**   
* @Title: MyRun.java 
* @Package cn.songzx.lock.lockinterruptibly.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����7:54:15 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.test;

import cn.songzx.lock.lockinterruptibly.service.MyService;

/**
 * @ClassName: MyRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����7:54:15
 * 
 */
public class MyRun {

	/**
	 * @Date: 2017��9��16������7:54:15
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) throws Exception {
		final MyService serivce = new MyService();
		Runnable runnableRef = new Runnable() {
			public void run() {
				serivce.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("ThreadA");
		threadA.start();
		Thread.sleep(5000L);
		Thread threadB = new Thread(runnableRef);
		threadB.setName("ThreadB");
		threadB.start();
		threadB.interrupt();// ����
		System.out.println("main end��");
	}

}
