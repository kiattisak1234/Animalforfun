package sdu.kiattisak.animalforfun;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    ImageView QuestionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int QuestionCount =10; //จำนวนข้อ
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initial view
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        QuestionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumnImageButton = (ImageButton) findViewById(R.id.imbVolumn);

        for (int i=1; i<= QuestionCount; i++){
            qID.add(i); //จองพื้นที่หน่วยความจำข้อความ
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));


    }

    private void setQuestion(Integer qID) {
        if (qID == 1) {
            answer = "นก";
            QuestionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

    if (qID == 2){
        answer = "แมว";
        QuestionImageView.setImageResource(R.drawable.cat_02);
        mediaPlayer = MediaPlayer.create(this, R.raw.cat);

        ArrayList<String> choice = new ArrayList<String>();
        choice.add("แมว");
        choice.add("ปลา");
        choice.add("หมู");
        choice.add("แกะ");
        Collections.shuffle(choice);
        btn1.setText(choice.remove(0));
        btn2.setText(choice.remove(0));
        btn3.setText(choice.remove(0));
        btn4.setText(choice.remove(0));
    }
    if (qID == 3){
        answer = "วัว";
        QuestionImageView.setImageResource(R.drawable.cow_02);
        mediaPlayer = MediaPlayer.create(this, R.raw.cow);

        ArrayList<String> choice = new ArrayList<String>();
        choice.add("วัว");
        choice.add("ช้าง");
        choice.add("หมู");
        choice.add("แกะ");
        Collections.shuffle(choice);
        btn1.setText(choice.remove(0));
        btn2.setText(choice.remove(0));
        btn3.setText(choice.remove(0));
        btn4.setText(choice.remove(0));
    }

    if (qID == 4){
            answer = "สุนัข";
            QuestionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สุนัข");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 5) {
            answer = "ช้าง";
            QuestionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6) {
            answer = "ม้า";
            QuestionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 7) {
            answer = "สิงโต";
            QuestionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 8) {
            answer = "หมู";
            QuestionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 9) {
            answer = "เเกะ";
            QuestionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }


        if (qID == 10) {
            answer = "ยุง";
            QuestionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ยุง");
            choice.add("หมู");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        } //End setQuestion Method แสดงคำถามบนหน้า XML

    public  void  choiceAns(View View){
        Button b =(Button) View;
        String buttonText = b.getText().toString();
        if (buttonText.equals(answer)){
            score++;
        }
        if (qID.isEmpty()){
            Dialogbox();
        }else {
            setQuestion(qID.remove(0));
        }
        }// End playsound Method

    private void Dialogbox() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.icon);
        builder.setTitle("สรุปคะแนน");

        builder.setMessage(getIntent().getStringExtra("name")+"ได้คะแนน:"+score+"คะแนน")   // โค้ด ผู้เล่นที่ใส่ชื่อ เเล้ว จบเกมจะ มีชื่อที่ผู้เล่น

                .setCancelable(false)
                .setPositiveButton("Exit Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                            finish();
                    }
                } )

                .setNegativeButton("REPLAY", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }

    public void playSound(View view){
        mediaPlayer.start();

    }
    }

//Main Class
