public interface Calculator{
    public int plus(int i,int j);
    public int multiple(int i,int j);
    //������ interface�� �߻�Ŭ������ ������ �޼��� ������ �ϸ� ������ ����.
    
    default int exec(int i, int j){
        return i + j;
    }
    //�ڹ� 8�� �������̽��� default Ű���带 �̿��Ͽ� �޼ҵ弱�� ��  ��������!! ����
  
    public static int exec2(int i,int j){
        return i*j;
    }
    //�������̽����� ������ static�޼���� interface��.�޼ҵ��();
}