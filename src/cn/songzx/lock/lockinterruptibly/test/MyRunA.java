/**   
* @Title: MyRunA.java 
* @Package cn.songzx.lock.lockinterruptibly.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����8:08:59 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.test;

import cn.songzx.lock.lockinterruptibly.service.MyServiceA;

/**
 * @ClassName: MyRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����8:08:59
 * 
 */
public class MyRunA {

	/**
	 * @Date: 2017��9��16������8:08:59
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) throws Exception {
		final MyServiceA service = new MyServiceA();
		Runnable runnableRef = new Runnable() {
			public void run() {
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("ThreadA");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("ThreadB");
		threadB.start();
	}

}
