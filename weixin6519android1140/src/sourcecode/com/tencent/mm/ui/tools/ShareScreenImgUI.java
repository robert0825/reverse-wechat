package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.at;
import java.io.File;

@a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141031", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareScreenImgUI
  extends MMActivity
{
  String filePath;
  private ae handler;
  private ProgressDialog htG;
  private Intent intent;
  Uri uri;
  
  public ShareScreenImgUI()
  {
    GMTrace.i(1920253034496L, 14307);
    this.htG = null;
    this.intent = null;
    this.filePath = null;
    this.uri = null;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2063194914816L, 15372);
        ShareScreenImgUI.a(ShareScreenImgUI.this);
        if (bg.nm(ShareScreenImgUI.this.filePath))
        {
          w.e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
          ShareScreenImgUI.b(ShareScreenImgUI.this);
          ShareScreenImgUI.this.finish();
          GMTrace.o(2063194914816L, 15372);
          return;
        }
        ShareScreenImgUI.c(ShareScreenImgUI.this);
        GMTrace.o(2063194914816L, 15372);
      }
    };
    GMTrace.o(1920253034496L, 14307);
  }
  
  private void chZ()
  {
    GMTrace.i(1920924123136L, 14312);
    Toast.makeText(this, R.l.ecI, 1).show();
    GMTrace.o(1920924123136L, 14312);
  }
  
  private void cix()
  {
    GMTrace.i(1920789905408L, 14311);
    w.i("MicroMsg.ShareScreenImgUI", "filepath:[%s]", new Object[] { this.filePath });
    Intent localIntent = getIntent();
    String str = localIntent.resolveType(this);
    int i;
    if ((str == null) || (str.length() == 0))
    {
      w.e("MicroMsg.ShareScreenImgUI", "map : mimeType is null");
      i = -1;
    }
    while (i == -1)
    {
      w.e("MicroMsg.ShareScreenImgUI", "launch, msgType is invalid");
      finish();
      GMTrace.o(1920789905408L, 14311);
      return;
      if (str.toLowerCase().contains("image"))
      {
        i = 0;
      }
      else
      {
        w.d("MicroMsg.ShareScreenImgUI", "map : unknown mimetype, send as file");
        i = 3;
      }
    }
    if ((!s.a(getIntent(), "Intro_Switch", false)) && (at.AT()) && (!at.wF()))
    {
      localIntent.setData(this.uri);
      localIntent.setClass(this, MsgRetransmitUI.class);
      localIntent.putExtra("Retr_File_Name", this.filePath);
      localIntent.putExtra("Retr_Msg_Type", i);
      localIntent.putExtra("Retr_Scene", 1);
      localIntent.putExtra("Retr_start_where_you_are", false);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
    for (;;)
    {
      finish();
      GMTrace.o(1920789905408L, 14311);
      return;
      if (!bg.nm(this.filePath))
      {
        localIntent = new Intent(this, ShareImgUI.class);
        localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(this.filePath)));
        localIntent.addFlags(67108864);
        localIntent.setType("image/*");
        localIntent.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), localIntent);
      }
      else
      {
        chZ();
      }
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(1920655687680L, 14310);
    this.intent = getIntent();
    if (this.intent == null)
    {
      w.e("MicroMsg.ShareScreenImgUI", "launch : fail, intent is null");
      chZ();
      finish();
      GMTrace.o(1920655687680L, 14310);
      return;
    }
    w.i("MicroMsg.ShareScreenImgUI", "intent = " + this.intent);
    String str = this.intent.getAction();
    this.uri = this.intent.getData();
    if (bg.nm(str))
    {
      w.e("MicroMsg.ShareScreenImgUI", "launch : fail, action is null");
      chZ();
      finish();
      GMTrace.o(1920655687680L, 14310);
      return;
    }
    if (str.equals("android.intent.action.VIEW"))
    {
      w.i("MicroMsg.ShareScreenImgUI", "send signal: " + str);
      if ((this.uri == null) || (!bg.l(this.uri)))
      {
        w.e("MicroMsg.ShareScreenImgUI", "launch : fail, not accepted: %s", new Object[] { this.uri });
        chZ();
        finish();
        GMTrace.o(1920655687680L, 14310);
        return;
      }
      getString(R.l.cUG);
      this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1956491821056L, 14577);
          GMTrace.o(1956491821056L, 14577);
        }
      });
      this.filePath = bg.f(this, this.uri);
      if (!bg.nm(this.filePath))
      {
        str = this.filePath;
        MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
        boolean bool = o.a(str, localDecodeResultLogger);
        if ((!bool) && (localDecodeResultLogger.getDecodeResult() >= 2000))
        {
          str = MMBitmapFactory.KVStatHelper.getKVStatString(str, 3, localDecodeResultLogger);
          g.ork.A(12712, str);
        }
        if (bool) {}
      }
      else
      {
        w.e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
        chZ();
        finish();
        GMTrace.o(1920655687680L, 14310);
        return;
      }
      cix();
      GMTrace.o(1920655687680L, 14310);
      return;
    }
    w.e("MicroMsg.ShareScreenImgUI", "launch : fail, uri is null");
    chZ();
    finish();
    GMTrace.o(1920655687680L, 14310);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1920521469952L, 14309);
    GMTrace.o(1920521469952L, 14309);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1920387252224L, 14308);
    super.onCreate(paramBundle);
    sq("");
    int i = s.a(getIntent(), "wizard_activity_result_code", 0);
    switch (i)
    {
    default: 
      w.e("MicroMsg.ShareScreenImgUI", "onCreate, should not reach here, resultCode = " + i);
      finish();
      GMTrace.o(1920387252224L, 14308);
      return;
    case 1: 
      finish();
      GMTrace.o(1920387252224L, 14308);
      return;
    }
    NotifyReceiver.rn();
    MP();
    GMTrace.o(1920387252224L, 14308);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ShareScreenImgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */