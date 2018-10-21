package com.example.administrator.dmiscountcat.Gadget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class IntentUtil {
        static Intent intent = new Intent();

        public static void startActivity(Context context, Class classname){

            intent.setClass(context,classname);
            context.startActivity(intent);
        }

        public static void setBundle(Bundle bundle){
            intent.putExtras(bundle);
        }


    }


