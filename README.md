�������̣�
��ǩ�� ATT �� attention
      IM  :  important

    1. ��pom�ļ�������druid �ڿ�ʼʱ��Ҫѡ��springboot��mybatis��jdbcûѡ�еĻ���Ҫ��pom������

    2. д��yml����yml��д��໷��������druid���໷���������ö����ͬ�����ݿ����á�

    3. dao�� dao����Ҫ����pojoʵ�����ʵ�����Ӧ��Dao�ӿڡ�
             ʵ������lombok��pom��Ҫ���ã��е�@data����
         BookDao���ӿڣ� �� ͷ��д@Mapperע����ӳ��
                        ���� �ڷ�������д@Insert ����ɾ�Ĳ�ע�⣩ 
                         *ATT ������@select��ȫ������int��selectһ������Book��һ������List<Book>
                              !!�����У�save��updata�����Book book ������������дInteger id�Ϳ�
                              ����������ֵԭ������������ص�����Ӱ��������������жϲ����Ƿ�ɹ���
        
    4. service, �����ӿں�impl��
                BookServce�ӿ������BookDao��˵��ֻ�ı��˷���ֵ����int���boolean��ԭ�򣺼�Impl��˵����  
                *IM implʵ����ͷ��д�� @Transactional����
                    ��service���ǩ(һ�㲻�����ڽӿ���)�����@Transactional�����Խ�����������spring�������
                      ��ÿ��ҵ�񷽷�ִ��ʱ���Ὺ��һ�����񣬲�����Щ���������ͬ�Ĺ���ʽ�������ڷ���ʧ��ʱ���Խ��лع���
                        
                        


