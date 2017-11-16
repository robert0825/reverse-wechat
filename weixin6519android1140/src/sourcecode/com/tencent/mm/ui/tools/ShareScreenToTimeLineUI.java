package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import java.io.File;

@a(3)
@JgClassChecked(author=12, fComment="checked", lastDate="20141031", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareScreenToTimeLineUI
  extends MMActivity
{
  String filePath;
  Uri uri;
  
  public ShareScreenToTimeLineUI()
  {
    GMTrace.i(1998770405376L, 14892);
    this.filePath = null;
    this.uri = null;
    GMTrace.o(1998770405376L, 14892);
  }
  
  private void chZ()
  {
    GMTrace.i(1999441494016L, 14897);
    Toast.makeText(this, R.l.ecK, 1).show();
    GMTrace.o(1999441494016L, 14897);
  }
  
  private void fr(String paramString1, String paramString2)
  {
    GMTrace.i(1999307276288L, 14896);
    Intent localIntent = new Intent();
    if (!bg.nm(paramString1))
    {
      localIntent.putExtra("sns_kemdia_path", paramString1);
      localIntent.putExtra("KFilterId", -1);
    }
    if (!bg.nm(paramString2)) {
      localIntent.putExtra("Kdescription", paramString2);
    }
    if ((at.AT()) && (!at.wF()))
    {
      localIntent.putExtra("K_go_to_SnsTimeLineUI", true);
      d.b(this, "sns", ".ui.En_c4f742e5", localIntent);
    }
    for (;;)
    {
      finish();
      GMTrace.o(1999307276288L, 14896);
      return;
      if (!bg.nm(paramString1))
      {
        paramString2 = new Intent(this, ShareToTimeLineUI.class);
        paramString2.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(paramString1)));
        paramString2.addFlags(32768).addFlags(268435456);
        paramString2.setType("image/*");
        paramString2.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), paramString2);
      }
      else
      {
        chZ();
      }
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(1999173058560L, 14895);
    Object localObject1 = getIntent();
    if (localObject1 == null)
    {
      w.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, intent is null");
      chZ();
      finish();
      GMTrace.o(1999173058560L, 14895);
      return;
    }
    Object localObject2 = ((Intent)localObject1).getAction();
    this.uri = ((Intent)localObject1).getData();
    if (bg.nm((String)localObject2))
    {
      w.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, action is null");
      chZ();
      finish();
      GMTrace.o(1999173058560L, 14895);
      return;
    }
    String str1 = s.i((Intent)localObject1, "Kdescription");
    String str2 = getIntent().resolveType(this);
    if (bg.nm(str2))
    {
      chZ();
      finish();
      GMTrace.o(1999173058560L, 14895);
      return;
    }
    if (!str2.contains("image"))
    {
      chZ();
      finish();
      GMTrace.o(1999173058560L, 14895);
      return;
    }
    if (((String)localObject2).equals("android.intent.action.VIEW"))
    {
      w.i("MicroMsg.ShareScreenToTimeLineUI", "send signal: " + (String)localObject2);
      if (!bg.l(this.uri))
      {
        w.e("MicroMsg.ShareScreenToTimeLineUI", "fail, not accepted: %s", new Object[] { this.uri });
        chZ();
        finish();
        GMTrace.o(1999173058560L, 14895);
        return;
      }
      this.filePath = bg.f(this, this.uri);
      if ((bg.nm(this.filePath)) || (!bg.SL(this.filePath)))
      {
        if (s.a((Intent)localObject1, "Ksnsupload_empty_img", false))
        {
          fr(this.filePath, str1);
          GMTrace.o(1999173058560L, 14895);
          return;
        }
        chZ();
        finish();
        GMTrace.o(1999173058560L, 14895);
        return;
      }
      localObject1 = this.filePath;
      localObject2 = new MMBitmapFactory.DecodeResultLogger();
      boolean bool = o.a((String)localObject1, (MMBitmapFactory.DecodeResultLogger)localObject2);
      if ((!bool) && (((MMBitmapFactory.DecodeResultLogger)localObject2).getDecodeResult() >= 2000))
      {
        localObject1 = MMBitmapFactory.KVStatHelper.getKVStatString(localObject1, 4, (MMBitmapFactory.DecodeResultLogger)localObject2);
        g.ork.A(12712, (String)localObject1);
      }
      if (bool)
      {
        fr(this.filePath, str1);
        GMTrace.o(1999173058560L, 14895);
        return;
      }
      chZ();
      finish();
      GMTrace.o(1999173058560L, 14895);
      return;
    }
    w.e("MicroMsg.ShareScreenToTimeLineUI", "launch : fail, uri is null");
    chZ();
    finish();
    GMTrace.o(1999173058560L, 14895);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1999038840832L, 14894);
    GMTrace.o(1999038840832L, 14894);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1998904623104L, 14893);
    super.onCreate(paramBundle);
    sq("");
    int i = s.a(getIntent(), "wizard_activity_result_code", 0);
    switch (i)
    {
    default: 
      w.e("MicroMsg.ShareScreenToTimeLineUI", "onCreate, should not reach here, resultCode = " + i);
      finish();
      GMTrace.o(1998904623104L, 14893);
      return;
    case 1: 
      finish();
      GMTrace.o(1998904623104L, 14893);
      return;
    }
    NotifyReceiver.rn();
    at.wS().a(new bf(new bf.a()
    {
      public final void a(e paramAnonymouse)
      {
        GMTrace.i(1952867942400L, 14550);
        GMTrace.o(1952867942400L, 14550);
      }
    }), 0);
    MP();
    GMTrace.o(1998904623104L, 14893);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\tools\ShareScreenToTimeLineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */