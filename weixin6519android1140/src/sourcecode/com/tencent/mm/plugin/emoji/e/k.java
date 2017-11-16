package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.applet.e;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class k
{
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    GMTrace.i(11555609509888L, 86096);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_title", paramString1);
    localIntent.putExtra("KContentObjDesc", paramString2);
    localIntent.putExtra("Ksnsupload_imgurl", paramString3);
    localIntent.putExtra("Ksnsupload_link", paramString4);
    localIntent.putExtra("KUploadProduct_UserData", paramString5);
    localIntent.putExtra("Ksnsupload_type", paramInt);
    paramString1 = u.gy("emoje_stroe");
    u.Av().p(paramString1, true).o("prePublishId", "emoje_stroe");
    localIntent.putExtra("reportSessionId", paramString1);
    d.a(paramContext, "sns", ".ui.En_c4f742e5", localIntent, false);
    GMTrace.o(11555609509888L, 86096);
  }
  
  public static void a(final MMActivity paramMMActivity, String paramString1, final int paramInt1, final int paramInt2, final String paramString2, final String paramString3, final String paramString4, final String paramString5, final int paramInt3, final String paramString6)
  {
    GMTrace.i(11555877945344L, 86098);
    e.b(paramMMActivity.vKB, paramString2, paramString4, paramString3, "", paramMMActivity.getString(R.l.cUs), new o.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(11556146380800L, 86100);
        if (paramAnonymousBoolean)
        {
          String str1 = this.kji;
          paramAnonymousInt = paramInt1;
          int i = paramInt2;
          Object localObject2 = paramString2;
          Object localObject3 = paramString3;
          String str2 = paramString4;
          String str3 = paramString5;
          int j = paramInt3;
          String str4 = paramString6;
          w.d("MicroMsg.emoji.EmojiSharedMgr", "doSharedToFriend");
          Object localObject1 = new WXMediaMessage();
          ((WXMediaMessage)localObject1).title = ((String)localObject2);
          ((WXMediaMessage)localObject1).description = ((String)localObject3);
          WXEmojiPageSharedObject localWXEmojiPageSharedObject = new WXEmojiPageSharedObject();
          localWXEmojiPageSharedObject.type = paramAnonymousInt;
          localWXEmojiPageSharedObject.tid = i;
          localWXEmojiPageSharedObject.title = ((String)localObject2);
          localWXEmojiPageSharedObject.desc = ((String)localObject3);
          localWXEmojiPageSharedObject.iconUrl = str2;
          localWXEmojiPageSharedObject.secondUrl = str3;
          localWXEmojiPageSharedObject.pageType = j;
          localWXEmojiPageSharedObject.url = str4;
          ((WXMediaMessage)localObject1).mediaObject = localWXEmojiPageSharedObject;
          n.IY();
          localObject2 = com.tencent.mm.ao.b.hC(str2);
          if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
          {
            w.i("MicroMsg.emoji.EmojiSharedMgr", "thumb image is not null");
            localObject3 = new ByteArrayOutputStream();
            ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject3);
            ((WXMediaMessage)localObject1).thumbData = ((ByteArrayOutputStream)localObject3).toByteArray();
          }
          localObject2 = new oj();
          ((oj)localObject2).eTm.eLU = ((WXMediaMessage)localObject1);
          ((oj)localObject2).eTm.toUser = str1;
          ((oj)localObject2).eTm.eTn = 49;
          ((oj)localObject2).eTm.eTo = str1;
          ((oj)localObject2).eTm.eTp = "";
          a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          if (!TextUtils.isEmpty(paramAnonymousString))
          {
            localObject1 = new ol();
            ((ol)localObject1).eTx.eTy = str1;
            ((ol)localObject1).eTx.content = paramAnonymousString;
            ((ol)localObject1).eTx.type = s.go(str1);
            ((ol)localObject1).eTx.flags = 0;
            a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          h.bm(paramMMActivity, paramMMActivity.getString(R.l.cUy));
          GMTrace.o(11556146380800L, 86100);
          return;
        }
        GMTrace.o(11556146380800L, 86100);
      }
    });
    GMTrace.o(11555877945344L, 86098);
  }
  
  public static void ch(Context paramContext)
  {
    GMTrace.i(11555743727616L, 86097);
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
    localIntent.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
    d.a(paramContext, ".ui.transmit.SelectConversationUI", localIntent, 2002);
    GMTrace.o(11555743727616L, 86097);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */