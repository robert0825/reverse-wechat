package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ai;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareToTimeLineUI
  extends AutoLoginActivity
  implements com.tencent.mm.ad.e
{
  private ProgressDialog htG;
  private Intent intent;
  
  public ShareToTimeLineUI()
  {
    GMTrace.i(1916494938112L, 14279);
    this.htG = null;
    GMTrace.o(1916494938112L, 14279);
  }
  
  private static boolean WR(String paramString)
  {
    GMTrace.i(1916897591296L, 14282);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(1916897591296L, 14282);
      return false;
    }
    MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
    boolean bool = o.a(paramString, localDecodeResultLogger);
    if ((!bool) && (localDecodeResultLogger.getDecodeResult() >= 2000))
    {
      paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 4, localDecodeResultLogger);
      com.tencent.mm.plugin.report.service.g.ork.A(12712, paramString);
    }
    GMTrace.o(1916897591296L, 14282);
    return bool;
  }
  
  private ArrayList<String> al(Bundle paramBundle)
  {
    GMTrace.i(1917031809024L, 14283);
    Object localObject1 = paramBundle.getParcelableArrayList("android.intent.extra.STREAM");
    if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
    {
      paramBundle = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Uri)((Iterator)localObject1).next();
        if ((localObject2 != null) && (bg.l((Uri)localObject2)) && (((Uri)localObject2).getScheme() != null))
        {
          localObject2 = bg.f(this, (Uri)localObject2);
          if (!bg.nm((String)localObject2)) {
            if (WR((String)localObject2))
            {
              w.i("MicroMsg.ShareToTimeLine", "multisend file path: " + (String)localObject2);
              paramBundle.add(localObject2);
            }
            else
            {
              w.w("MicroMsg.ShareToTimeLine", "not image: " + (String)localObject2);
            }
          }
        }
        else
        {
          w.e("MicroMsg.ShareToTimeLine", "unaccepted uri: " + localObject2);
        }
      }
      if (paramBundle.size() > 0)
      {
        GMTrace.o(1917031809024L, 14283);
        return paramBundle;
      }
      GMTrace.o(1917031809024L, 14283);
      return null;
    }
    w.e("MicroMsg.ShareToTimeLine", "getParcelableArrayList failed");
    GMTrace.o(1917031809024L, 14283);
    return null;
  }
  
  private void c(ArrayList<String> paramArrayList, String paramString)
  {
    GMTrace.i(1917300244480L, 14285);
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      finish();
      GMTrace.o(1917300244480L, 14285);
      return;
    }
    if (paramArrayList.size() > 9) {
      paramArrayList.subList(9, paramArrayList.size()).clear();
    }
    Object localObject;
    if ((at.AT()) && (!at.wF()))
    {
      localObject = new Intent();
      ((Intent)localObject).putStringArrayListExtra("sns_kemdia_path_list", paramArrayList);
      if (!bg.nm(paramString)) {
        ((Intent)localObject).putExtra("Kdescription", paramString);
      }
      ((Intent)localObject).putExtra("K_go_to_SnsTimeLineUI", true);
      ((Intent)localObject).putExtra("Ksnsupload_source", 12);
      com.tencent.mm.bj.d.b(this, "sns", ".ui.En_c4f742e5", (Intent)localObject);
    }
    for (;;)
    {
      finish();
      GMTrace.o(1917300244480L, 14285);
      return;
      paramString = new Intent(this, ShareToTimeLineUI.class);
      localObject = new ArrayList(paramArrayList.size());
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        ((ArrayList)localObject).add(Uri.fromFile(new File((String)paramArrayList.next())));
      }
      paramString.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList)localObject);
      paramString.setAction("android.intent.action.SEND_MULTIPLE");
      paramString.addFlags(32768).addFlags(268435456);
      paramString.setType("image/*");
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(268435456).addFlags(32768), paramString);
    }
  }
  
  private void chZ()
  {
    GMTrace.i(1917434462208L, 14286);
    Toast.makeText(this, R.l.ecK, 1).show();
    GMTrace.o(1917434462208L, 14286);
  }
  
  private void cix()
  {
    GMTrace.i(1916763373568L, 14281);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      w.e("MicroMsg.ShareToTimeLine", "launch : fail, intent is null");
      chZ();
      finish();
      GMTrace.o(1916763373568L, 14281);
      return;
    }
    Object localObject1 = localIntent.getAction();
    Object localObject2 = s.ah(localIntent);
    if (bg.nm((String)localObject1))
    {
      w.e("MicroMsg.ShareToTimeLine", "launch : fail, action is null");
      chZ();
      finish();
      GMTrace.o(1916763373568L, 14281);
      return;
    }
    String str1 = s.i(localIntent, "Kdescription");
    String str2 = getIntent().resolveType(this);
    if (bg.nm(str2))
    {
      chZ();
      finish();
      GMTrace.o(1916763373568L, 14281);
      return;
    }
    if (!str2.contains("image"))
    {
      chZ();
      finish();
      GMTrace.o(1916763373568L, 14281);
      return;
    }
    if ((((String)localObject1).equals("android.intent.action.SEND")) && (localObject2 != null))
    {
      w.i("MicroMsg.ShareToTimeLine", "send signal: " + (String)localObject1);
      localObject1 = ((Bundle)localObject2).getParcelable("android.intent.extra.STREAM");
      if ((localObject1 == null) || (!(localObject1 instanceof Uri)))
      {
        if (localIntent.getBooleanExtra("Ksnsupload_empty_img", false))
        {
          fr(null, str1);
          GMTrace.o(1916763373568L, 14281);
          return;
        }
        chZ();
        finish();
        GMTrace.o(1916763373568L, 14281);
        return;
      }
      localObject2 = (Uri)localObject1;
      if (!bg.l((Uri)localObject2))
      {
        w.e("MicroMsg.ShareToTimeLine", "deal : fail, not accept, %s", new Object[] { localObject2 });
        chZ();
        finish();
        GMTrace.o(1916763373568L, 14281);
        return;
      }
      localObject1 = bg.f(this, (Uri)localObject2);
      if (!bg.nm((String)localObject1)) {
        break label559;
      }
      localObject1 = com.tencent.mm.pluginsdk.l.d.a(getContentResolver(), (Uri)localObject2, 2);
    }
    label559:
    for (;;)
    {
      if ((bg.nm((String)localObject1)) || (!bg.SL((String)localObject1)))
      {
        if (localIntent.getBooleanExtra("Ksnsupload_empty_img", false))
        {
          fr((String)localObject1, str1);
          GMTrace.o(1916763373568L, 14281);
          return;
        }
        chZ();
        finish();
        GMTrace.o(1916763373568L, 14281);
        return;
      }
      if (WR((String)localObject1))
      {
        fr((String)localObject1, str1);
        GMTrace.o(1916763373568L, 14281);
        return;
      }
      chZ();
      finish();
      GMTrace.o(1916763373568L, 14281);
      return;
      if ((((String)localObject1).equals("android.intent.action.SEND_MULTIPLE")) && (localObject2 != null) && (((Bundle)localObject2).containsKey("android.intent.extra.STREAM")))
      {
        w.i("MicroMsg.ShareToTimeLine", "send multi: " + (String)localObject1);
        localObject1 = al((Bundle)localObject2);
        if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
        {
          chZ();
          finish();
          GMTrace.o(1916763373568L, 14281);
          return;
        }
        c((ArrayList)localObject1, str1);
        GMTrace.o(1916763373568L, 14281);
        return;
      }
      w.e("MicroMsg.ShareToTimeLine", "launch : fail, uri is null");
      chZ();
      finish();
      GMTrace.o(1916763373568L, 14281);
      return;
    }
  }
  
  private void fr(String paramString1, String paramString2)
  {
    GMTrace.i(1917166026752L, 14284);
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
      localIntent.putExtra("Ksnsupload_source", 12);
      com.tencent.mm.bj.d.b(this, "sns", ".ui.En_c4f742e5", localIntent);
    }
    for (;;)
    {
      finish();
      GMTrace.o(1917166026752L, 14284);
      return;
      if (!bg.nm(paramString1))
      {
        paramString2 = new Intent(this, ShareToTimeLineUI.class);
        paramString2.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(paramString1)));
        paramString2.addFlags(32768).addFlags(268435456);
        paramString2.setType("image/*");
        paramString2.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(268435456).addFlags(32768), paramString2);
      }
      else
      {
        chZ();
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1917837115392L, 14289);
    w.i("MicroMsg.ShareToTimeLine", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    at.wS().b(1200, this);
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      cix();
      GMTrace.o(1917837115392L, 14289);
      return;
    }
    finish();
    GMTrace.o(1917837115392L, 14289);
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(1917702897664L, 14288);
    switch (2.jjk[parama.ordinal()])
    {
    default: 
      finish();
      GMTrace.o(1917702897664L, 14288);
      return;
    }
    this.intent = paramIntent;
    int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("SystemShareControlBitset"), 0);
    w.i("MicroMsg.ShareToTimeLine", "now permission = %d", new Object[] { Integer.valueOf(i) });
    if ((i & 0x2) > 0)
    {
      w.e("MicroMsg.ShareToTimeLine", "now allowed to share to friend");
      finish();
      GMTrace.o(1917702897664L, 14288);
      return;
    }
    parama = s.i(paramIntent, "android.intent.extra.TEXT");
    w.i("MicroMsg.ShareToTimeLine", "postLogin, text = %s", new Object[] { parama });
    if (!bg.nm(parama))
    {
      parama = String.format("weixin://dl/business/systemshare/?txt=%s", new Object[] { URLEncoder.encode(parama) });
      getString(R.l.cUG);
      this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2026285039616L, 15097);
          ShareToTimeLineUI.this.finish();
          GMTrace.o(2026285039616L, 15097);
        }
      });
      at.wS().a(1200, this);
      parama = new ai(parama, 15, null);
      at.wS().a(parama, 0);
      GMTrace.o(1917702897664L, 14288);
      return;
    }
    cix();
    GMTrace.o(1917702897664L, 14288);
  }
  
  protected final boolean aUi()
  {
    GMTrace.i(1916629155840L, 14280);
    if ((!at.AT()) || (at.wF()))
    {
      w.w("MicroMsg.ShareToTimeLine", "not login");
      cix();
      GMTrace.o(1916629155840L, 14280);
      return true;
    }
    GMTrace.o(1916629155840L, 14280);
    return false;
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(1917568679936L, 14287);
    GMTrace.o(1917568679936L, 14287);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ShareToTimeLineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */