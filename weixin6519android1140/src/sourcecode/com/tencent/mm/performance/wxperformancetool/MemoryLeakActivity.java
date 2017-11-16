package com.tencent.mm.performance.wxperformancetool;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bw.b;
import com.tencent.mm.performance.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import java.lang.ref.WeakReference;
import java.util.HashMap;

@TargetApi(17)
public class MemoryLeakActivity
  extends Activity
{
  private AlertDialog hit;
  private String hiu;
  private ae mHandler;
  
  public MemoryLeakActivity()
  {
    GMTrace.i(13138170740736L, 97887);
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(13139781353472L, 97899);
        if (((WeakReference)a.hix.get(MemoryLeakActivity.a(MemoryLeakActivity.this))).get() == null)
        {
          MemoryLeakActivity.this.finish();
          GMTrace.o(13139781353472L, 97899);
          return;
        }
        MemoryLeakActivity.b(MemoryLeakActivity.this).show();
        GMTrace.o(13139781353472L, 97899);
      }
    };
    GMTrace.o(13138170740736L, 97887);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(13138304958464L, 97888);
    super.onCreate(paramBundle);
    setContentView(a.a.cpE);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("memory leak");
    this.hiu = getIntent().getStringExtra("key");
    String str2 = getIntent().getStringExtra("tag");
    final String str1 = getIntent().getStringExtra("class");
    paramBundle = str1;
    if (str1.contains(" ")) {
      paramBundle = str1.substring(str1.indexOf(" "));
    }
    str1 = paramBundle.replace(".", "_");
    localBuilder.setMessage(str2 + paramBundle + "\n\npath:" + b.vFc + str1 + ".zip");
    localBuilder.setCancelable(true);
    localBuilder.setPositiveButton("dumphprof", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(13139512918016L, 97897);
        b.UZ(str1);
        if ((MemoryLeakActivity.b(MemoryLeakActivity.this) != null) && (MemoryLeakActivity.b(MemoryLeakActivity.this).isShowing())) {
          MemoryLeakActivity.b(MemoryLeakActivity.this).dismiss();
        }
        MemoryLeakActivity.this.finish();
        GMTrace.o(13139512918016L, 97897);
      }
    });
    localBuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(13140586659840L, 97905);
        if ((MemoryLeakActivity.b(MemoryLeakActivity.this) != null) && (MemoryLeakActivity.b(MemoryLeakActivity.this).isShowing())) {
          MemoryLeakActivity.b(MemoryLeakActivity.this).dismiss();
        }
        MemoryLeakActivity.this.finish();
        GMTrace.o(13140586659840L, 97905);
      }
    });
    localBuilder.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(13133338902528L, 97851);
        MemoryLeakActivity.this.finish();
        GMTrace.o(13133338902528L, 97851);
      }
    });
    this.hit = localBuilder.create();
    b.bVD();
    this.mHandler.sendEmptyMessageDelayed(0, 200L);
    GMTrace.o(13138304958464L, 97888);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(13138439176192L, 97889);
    super.onDestroy();
    a.hix.remove(this.hiu);
    this.mHandler.removeCallbacksAndMessages(null);
    if ((this.hit != null) && (this.hit.isShowing()))
    {
      this.hit.dismiss();
      this.hit = null;
    }
    GMTrace.o(13138439176192L, 97889);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\performance\wxperformancetool\MemoryLeakActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */