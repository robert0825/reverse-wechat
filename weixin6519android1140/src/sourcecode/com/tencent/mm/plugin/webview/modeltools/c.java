package com.tencent.mm.plugin.webview.modeltools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

public final class c
{
  private String rGv;
  private String rGw;
  private ValueCallback<Uri> rGx;
  private ValueCallback<Uri[]> rGy;
  
  public c()
  {
    GMTrace.i(11979871748096L, 89257);
    this.rGv = null;
    this.rGw = null;
    this.rGx = null;
    this.rGy = null;
    GMTrace.o(11979871748096L, 89257);
  }
  
  private void bCP()
  {
    GMTrace.i(11980140183552L, 89259);
    this.rGv = null;
    this.rGx = null;
    this.rGy = null;
    this.rGw = null;
    GMTrace.o(11980140183552L, 89259);
  }
  
  private void h(Uri paramUri)
  {
    GMTrace.i(11980274401280L, 89260);
    if (this.rGx != null)
    {
      this.rGx.onReceiveValue(paramUri);
      GMTrace.o(11980274401280L, 89260);
      return;
    }
    if (this.rGy != null)
    {
      if (paramUri == null)
      {
        this.rGy.onReceiveValue(null);
        GMTrace.o(11980274401280L, 89260);
        return;
      }
      this.rGy.onReceiveValue(new Uri[] { paramUri });
    }
    GMTrace.o(11980274401280L, 89260);
  }
  
  public final void a(Activity paramActivity, e parame, ValueCallback<Uri> paramValueCallback, ValueCallback<Uri[]> paramValueCallback1, String paramString1, String paramString2)
  {
    GMTrace.i(19382650535936L, 144412);
    w.i("MicroMsg.WebViewUI.FileChooser", "openFileChooser with wvPerm(%s), callback(%s), callbackLL(%s), acceptType(%s), capture(%s)", new Object[] { parame, paramValueCallback, paramValueCallback1, paramString1, paramString2 });
    bCP();
    if ((parame == null) || (parame.bDM() == null))
    {
      w.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser fail, wvPerm is null");
      h(null);
      GMTrace.o(19382650535936L, 144412);
      return;
    }
    if (!parame.bDM().eS(56))
    {
      w.e("MicroMsg.WebViewUI.FileChooser", "open file chooser failed, permission fail");
      h(null);
      GMTrace.o(19382650535936L, 144412);
      return;
    }
    this.rGx = paramValueCallback;
    this.rGy = paramValueCallback1;
    this.rGw = System.currentTimeMillis();
    this.rGv = paramString1;
    paramValueCallback = this.rGw;
    paramValueCallback1 = new Intent("android.intent.action.GET_CONTENT");
    paramValueCallback1.addCategory("android.intent.category.OPENABLE");
    int i;
    if (bg.nm(paramString1))
    {
      paramValueCallback1.setType("*/*");
      parame = null;
      if (bg.nm(paramString2)) {
        break label448;
      }
      if (!"camera".equalsIgnoreCase(paramString2)) {
        break label308;
      }
      parame = new Intent[] { ai.Lm(paramValueCallback) };
      i = 0;
    }
    for (;;)
    {
      label223:
      if ((i != 0) || (parame == null) || (parame.length == 0))
      {
        paramValueCallback = new Intent("android.intent.action.CHOOSER");
        paramValueCallback.putExtra("android.intent.extra.INITIAL_INTENTS", parame);
        paramValueCallback.putExtra("android.intent.extra.TITLE", ab.getContext().getString(R.l.elI));
        paramValueCallback.putExtra("android.intent.extra.INTENT", paramValueCallback1);
      }
      for (parame = paramValueCallback;; parame = parame[0])
      {
        paramActivity.startActivityForResult(parame, 1);
        GMTrace.o(19382650535936L, 144412);
        return;
        paramValueCallback1.setType(paramString1);
        break;
        label308:
        if ("camcorder".equalsIgnoreCase(paramString2))
        {
          parame = new Intent[] { ai.bCq() };
          i = 0;
          break label223;
        }
        if ("microphone".equalsIgnoreCase(paramString2))
        {
          parame = new Intent[] { ai.bCr() };
          i = 0;
          break label223;
        }
        if (!"*".equalsIgnoreCase(paramString2)) {
          break label488;
        }
        if (paramString1.equalsIgnoreCase("image/*"))
        {
          parame = new Intent[1];
          parame[0] = ai.Lm(paramValueCallback);
        }
        for (;;)
        {
          i = 1;
          break;
          if (paramString1.equalsIgnoreCase("audio/*"))
          {
            parame = new Intent[1];
            parame[0] = ai.bCr();
          }
          else if (paramString1.equalsIgnoreCase("video/*"))
          {
            parame = new Intent[1];
            parame[0] = ai.bCq();
          }
        }
        label448:
        if (!f.eu(16)) {
          break label488;
        }
        w.i("MicroMsg.WebviewJSSDKUtil", "android API version is below 16.");
        parame = new Intent[] { ai.Lm(paramValueCallback) };
        i = 0;
        break label223;
      }
      label488:
      parame = null;
      i = 0;
    }
  }
  
  public final boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(16885798141952L, 125809);
    if (paramInt1 == 1)
    {
      if ((this.rGx == null) && (this.rGy == null))
      {
        w.w("MicroMsg.WebViewUI.FileChooser", "uploadFileCallback is null.");
        GMTrace.o(16885798141952L, 125809);
        return true;
      }
      Object localObject1;
      Object localObject2;
      if (paramInt2 == -1)
      {
        localObject1 = null;
        if (paramIntent != null)
        {
          localObject1 = null;
          if (paramIntent.getData() != null) {
            break label233;
          }
          localObject2 = paramIntent.getExtras();
          if (localObject2 != null)
          {
            if (((Bundle)localObject2).getParcelable("android.intent.extra.STREAM") != null) {
              localObject1 = (Uri)((Bundle)localObject2).getParcelable("android.intent.extra.STREAM");
            }
          }
          else
          {
            label102:
            localObject1 = bg.f(paramMMActivity, (Uri)localObject1);
            w.i("MicroMsg.WebViewUI.FileChooser", "get file path:[%s]", new Object[] { localObject1 });
          }
        }
        else
        {
          if (bg.nm((String)localObject1)) {
            break label448;
          }
          paramMMActivity = s.PQ((String)localObject1);
          w.d("MicroMsg.WebViewUI.FileChooser", "get file mime type [%s]", new Object[] { paramMMActivity });
          if (!bg.nm(this.rGv)) {
            break label243;
          }
          paramInt1 = 1;
          label168:
          if (paramInt1 == 0) {
            break label478;
          }
          if (paramIntent.getData() != null) {
            break label439;
          }
          paramMMActivity = Uri.fromFile(new File((String)localObject1));
        }
      }
      for (;;)
      {
        w.d("MicroMsg.WebViewUI.FileChooser", "result = " + paramMMActivity);
        h(paramMMActivity);
        bCP();
        break;
        localObject1 = null;
        break label102;
        label233:
        localObject1 = paramIntent.getData();
        break label102;
        label243:
        localObject2 = this.rGv.split(",");
        paramInt2 = localObject2.length;
        paramInt1 = 0;
        for (;;)
        {
          if (paramInt1 >= paramInt2) {
            break label434;
          }
          Object localObject3 = localObject2[paramInt1].replace(" ", "");
          boolean bool;
          if (bg.nm((String)localObject3)) {
            bool = true;
          }
          for (;;)
          {
            if (!bool) {
              break label427;
            }
            paramInt1 = 1;
            break;
            if (!bg.nm(paramMMActivity))
            {
              if ((!((String)localObject3).contains("/")) || (!paramMMActivity.contains("/")))
              {
                bool = ((String)localObject3).equals(paramMMActivity);
                continue;
              }
              localObject3 = ((String)localObject3).split("/");
              String[] arrayOfString = paramMMActivity.split("/");
              if (bg.nl(localObject3[0]).equals(arrayOfString[0]))
              {
                if ((bg.nl(localObject3[1]).equals("*")) || (bg.nl(localObject3[1]).equals(arrayOfString[1])))
                {
                  bool = true;
                  continue;
                }
                bool = false;
                continue;
              }
            }
            bool = false;
          }
          label427:
          paramInt1 += 1;
        }
        label434:
        paramInt1 = 0;
        break label168;
        label439:
        paramMMActivity = paramIntent.getData();
        continue;
        label448:
        paramMMActivity = new File(ai.Ll(this.rGw));
        if (paramMMActivity.exists()) {
          paramMMActivity = Uri.fromFile(paramMMActivity);
        } else {
          label478:
          paramMMActivity = null;
        }
      }
    }
    GMTrace.o(16885798141952L, 125809);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */