/**   
* @Title: MyRunB.java 
* @Package cn.songzx.lock.lockinterruptibly.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����9:07:59 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.test;

import cn.songzx.lock.lockinterruptibly.extthread.MyThreadA;
import cn.songzx.lock.lockinterruptibly.service.MyServiceB;

/**
 * @ClassName: MyRunB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����9:07:59
 * 
 */
public class MyRunB {

	/**
	 * @Date: 2017��9��16������9:07:59
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MyServiceB service = new MyServiceB();

			MyThreadA threadA = new MyThreadA(service);
			threadA.start();
			Thread.sleep(3000L);
			threadA.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
