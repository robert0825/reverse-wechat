package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class ax
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 275;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "shareEmoticon";
  
  public ax()
  {
    GMTrace.i(17039477440512L, 126954);
    GMTrace.o(17039477440512L, 126954);
  }
  
  public final void a(final Context paramContext, final String paramString, final GameJsApiMMTask.a parama)
  {
    GMTrace.i(17039611658240L, 126955);
    w.i("MicroMsg.GameJsApiShareEmotion", "invoke");
    paramString = com.tencent.mm.plugin.game.gamewebview.a.d.qe(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.GameJsApiShareEmotion", "data is null");
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:fail_null_data", null));
      GMTrace.o(17039611658240L, 126955);
      return;
    }
    Object localObject1 = paramString.optString("base64DataString");
    paramString = paramString.optString("url");
    if (!bg.nm((String)localObject1))
    {
      w.i("MicroMsg.GameJsApiShareEmotion", "use base64DataString");
      int i = ((String)localObject1).indexOf(";base64,");
      paramString = "";
      if (i != -1) {
        paramString = ((String)localObject1).substring(i + 8, ((String)localObject1).length());
      }
      try
      {
        paramString = Base64.decode(paramString, 0);
        if (bg.bq(paramString))
        {
          parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:fail", null));
          GMTrace.o(17039611658240L, 126955);
          return;
        }
      }
      catch (Exception paramContext)
      {
        w.e("MicroMsg.GameJsApiShareEmotion", "doShareEmoticon error:" + paramContext.getMessage());
        parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:fail_base64_decode_fail", null));
        GMTrace.o(17039611658240L, 126955);
        return;
      }
      localObject1 = com.tencent.mm.a.g.n(paramString);
      at.AR();
      localObject2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", (String)localObject1);
      if ((!e.aZ((String)localObject2)) || (!com.tencent.mm.a.g.bg((String)localObject2).equalsIgnoreCase((String)localObject1))) {
        e.b((String)localObject2, paramString, paramString.length);
      }
      b(paramContext, (String)localObject1, parama);
      GMTrace.o(17039611658240L, 126955);
      return;
    }
    w.i("MicroMsg.GameJsApiShareEmotion", "doShareEmoticon use url:%s", new Object[] { paramString });
    localObject1 = new File(paramContext.getCacheDir(), com.tencent.mm.a.g.n(paramString.getBytes()));
    if (((File)localObject1).exists())
    {
      paramString = com.tencent.mm.a.g.h((File)localObject1);
      at.AR();
      localObject2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", paramString);
      if (!FileOp.aZ((String)localObject2)) {
        FileOp.o(((File)localObject1).getAbsolutePath(), (String)localObject2);
      }
      b(paramContext, paramString, parama);
      GMTrace.o(17039611658240L, 126955);
      return;
    }
    Object localObject2 = new c.a();
    ((c.a)localObject2).gKC = true;
    ((c.a)localObject2).gKE = ((File)localObject1).getAbsolutePath();
    ((c.a)localObject2).gLe = new Object[] { ((File)localObject1).getAbsolutePath() };
    localObject1 = ((c.a)localObject2).Jn();
    h.aqJ().a(paramString, null, (com.tencent.mm.ao.a.a.c)localObject1, new i()
    {
      public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(17064039284736L, 127137);
        w.i("MicroMsg.GameJsApiShareEmotion", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramAnonymousString });
        if ((paramAnonymousBitmap != null) && (paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0))
        {
          if ((paramAnonymousVarArgs[0] != null) && ((paramAnonymousVarArgs[0] instanceof String)))
          {
            if (paramAnonymousString.equals(paramString))
            {
              paramAnonymousString = new File(paramAnonymousVarArgs[0].toString());
              if (paramAnonymousString.exists())
              {
                paramAnonymousBitmap = com.tencent.mm.a.g.h(paramAnonymousString);
                at.AR();
                paramAnonymousVarArgs = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", paramAnonymousBitmap);
                FileOp.o(paramAnonymousString.getAbsolutePath(), paramAnonymousVarArgs);
                ax.this.b(paramContext, paramAnonymousBitmap, parama);
                GMTrace.o(17064039284736L, 127137);
                return;
              }
              paramAnonymousString = parama;
              paramAnonymousBitmap = ax.this;
              paramAnonymousString.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:fail", null));
              GMTrace.o(17064039284736L, 127137);
              return;
            }
            paramAnonymousString = parama;
            paramAnonymousBitmap = ax.this;
            paramAnonymousString.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:fail", null));
            GMTrace.o(17064039284736L, 127137);
            return;
          }
          paramAnonymousString = parama;
          paramAnonymousBitmap = ax.this;
          paramAnonymousString.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:fail", null));
          GMTrace.o(17064039284736L, 127137);
          return;
        }
        paramAnonymousString = parama;
        paramAnonymousBitmap = ax.this;
        paramAnonymousString.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:fail", null));
        GMTrace.o(17064039284736L, 127137);
      }
    });
    GMTrace.o(17039611658240L, 126955);
  }
  
  public final void b(Context paramContext, String paramString, final GameJsApiMMTask.a parama)
  {
    GMTrace.i(17039745875968L, 126956);
    Intent localIntent = new Intent();
    localIntent.putExtra("scene_from", 4);
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("Retr_Msg_Type", 5);
    localIntent.putExtra("Retr_Msg_thumb_path", paramString);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
    if ((paramContext instanceof MMActivity))
    {
      ((MMActivity)paramContext).vKC = new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(17058804793344L, 127098);
          w.i("MicroMsg.GameJsApiShareEmotion", "mmOnActivityResult, %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          if (paramAnonymousInt1 == (ax.this.hashCode() & 0xFFFF)) {
            w.i("MicroMsg.GameJsApiShareEmotion", "share emmotion resultCode: %d", new Object[] { Integer.valueOf(paramAnonymousInt2) });
          }
          Object localObject;
          String str1;
          switch (paramAnonymousInt2)
          {
          default: 
            paramAnonymousIntent = parama;
            localObject = ax.this;
            paramAnonymousIntent.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:ok", null));
            GMTrace.o(17058804793344L, 127098);
            return;
          case -1: 
            localObject = bg.aq(paramAnonymousIntent.getStringExtra("Select_Conv_User"), "");
            str1 = bg.aq(paramAnonymousIntent.getStringExtra("emoji_thumb_path"), "");
            paramAnonymousIntent = h.arl().kjy.UK(str1);
            if (paramAnonymousIntent == null)
            {
              at.AR();
              String str2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", str1);
              if (e.aZ(str2)) {
                if (o.RH(str2))
                {
                  paramAnonymousInt1 = EmojiInfo.vCw;
                  paramAnonymousIntent = h.arl().kjy.b(str1, "", EmojiInfo.vCo, paramAnonymousInt1, e.aY(str2), "");
                }
              }
            }
            break;
          }
          for (;;)
          {
            localObject = bg.g(bg.aq((String)localObject, "").split(",")).iterator();
            for (;;)
            {
              if (((Iterator)localObject).hasNext())
              {
                str1 = (String)((Iterator)localObject).next();
                if (paramAnonymousIntent != null)
                {
                  h.arh().a(str1, paramAnonymousIntent, null);
                  continue;
                  paramAnonymousInt1 = EmojiInfo.vCv;
                  break;
                }
              }
            }
            paramAnonymousIntent = parama;
            localObject = ax.this;
            paramAnonymousIntent.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:ok", null));
            GMTrace.o(17058804793344L, 127098);
            return;
            paramAnonymousIntent = parama;
            localObject = ax.this;
            paramAnonymousIntent.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("shareEmoticon:ok", null));
            GMTrace.o(17058804793344L, 127098);
            return;
          }
        }
      };
      com.tencent.mm.bj.d.a(paramContext, ".ui.transmit.SelectConversationUI", localIntent, hashCode() & 0xFFFF);
    }
    GMTrace.o(17039745875968L, 126956);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */