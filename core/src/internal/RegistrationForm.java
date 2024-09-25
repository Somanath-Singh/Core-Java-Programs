package internal;
import java.awt.*;
import javax.swing.*;
class RegistrationForm extends JFrame  {
    Container cn;
    JLabel name,roll,regd,email,ph,branch,sem,stream,gen,hob;
    JTextField nm,ro,reg,em,p;
    JCheckBox hb1,hb2,hb3;
    JRadioButton ge,f;
    JComboBox br,str,seme;
    JButton sub,res;
    public RegistrationForm(){
        cn=getContentPane();
        setTitle("RegistrationForm");
        cn.setLayout(null);
        cn.setBackground(Color.GREEN);
        setSize(2000,2000);
        name=new JLabel("Name:");
        name.setBounds(100,50,150,30);
        cn.add(name);

        nm=new JTextField(30);
        nm.setBounds(400,50,150,30);
        cn.add(nm);

        roll=new JLabel("RollNo:");
        roll.setBounds(100,100,150,30);
        cn.add(roll);

        ro=new JTextField(10);
        ro.setBounds(400,100,150,30);
        cn.add(ro);

        regd=new JLabel("RegdNo:");
        regd.setBounds(100,150,150,30);
        cn.add(regd);

        reg=new JTextField(30);
        reg.setBounds(400,150,150,30);
        cn.add(reg);

        email=new JLabel("Email:");
        email.setBounds(100,200,150,30);
        cn.add(email);

        em=new JTextField(30);
        em.setBounds(400,200,150,30);
        cn.add(em);

        ph=new JLabel("Phone:");
        ph.setBounds(100,250,150,30);
        cn.add(ph);

        p=new JTextField(30);
        p.setBounds(400,250,150,30);
        cn.add(p);

        branch=new JLabel("Branch:");
        branch.setBounds(100,300,150,30);
        cn.add(branch);

        br=new JComboBox();
        br.addItem("CSE");
        br.addItem("MCA");
        br.addItem("ETC");
        br.addItem("ME");
        br.setBounds(400,300,150,30);
        cn.add(br);

        sem=new JLabel("Semester:");
        sem.setBounds(100,350,150,30);
        cn.add(sem);

        seme=new JComboBox();
        seme.addItem("1st");
        seme.addItem("2nd");
        seme.addItem("3rd");
        seme.addItem("4th");
        seme.setBounds(400,350,150,30);
        cn.add(seme);

        stream=new JLabel("Stream:");
        stream.setBounds(100,400,150,30);
        cn.add(stream);

        str=new JComboBox();
        str.addItem("arts");
        str.addItem("science");
        str.addItem("commerce");
        str.addItem("IT");
        str.setBounds(400,400,150,30);
        cn.add(str);

        gen=new JLabel("Gender:");
        gen.setBounds(100,450,150,30);
        cn.add(gen);

        ge=new JRadioButton("Male");
        ge.setBounds(400,450,150,30);
        cn.add(ge);

        f=new JRadioButton("Female");
        f.setBounds(600,450,150,30);
        cn.add(f);

        ButtonGroup bg=new ButtonGroup();
        bg.add(ge);
        bg.add(f);

        hob=new JLabel("Hobbies");
        hob.setBounds(100,500,150,30);
        cn.add(hob);

        hb1=new JCheckBox("Play");
        hb1.setBounds(400,500,150,30);
        cn.add(hb1);

        hb2=new JCheckBox("Read");
        hb2.setBounds(600,500,150,30);
        cn.add(hb2);

        hb3=new JCheckBox("Sleep");
        hb3.setBounds(800,500,150,30);
        cn.add(hb3);
        
        sub=new JButton("Submit");
        sub.setBounds(300,600,150,30);
        cn.add(sub);

        res=new JButton("Reset");
        res.setBounds(500,600,150,30);
        cn.add(res);
        setVisible(true);
    }
    public static void main(String[] args) {
    new RegistrationForm();
    }

}