package com.company.section1;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���콲Ů����˵Ĺ��£�������¹����������ģ�
 * �ܾúܾ���ǰ���̹ſ�������أ���������������ǳ���ɽ����ľ�����һƬ����
 * One day��Ů��½�����һ�⣬����̫��į��̫�¶��ˣ�û����Ц�ġ���޵ġ���˵���Ķ���
 * ����ô���أ����óŮ洣�����ѽ�������ѽ��Ȼ������ͣ��Ű���¯�������������̫�׽��ǵı������п������Ǿ������ˣ�
 * ���ǰ���������˵Ĺ�����Java������ֳ�����
 */
public class HumanFactory extends AbstractHumanFactory {
	
	public <W extends Human> W createHuman(Class<W> c){
		//����һ������������
		Human human=null;  	
		try {
			 //����һ������
			human = (Human)Class.forName(c.getName()).newInstance();  			
		} catch (Exception e) {
			System.out.println("�������ɴ���");
		}
		return (W)human;
	}
}
