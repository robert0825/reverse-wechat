package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.pluginsdk.ui.applet.r;
import com.tencent.mm.pluginsdk.ui.applet.r.a;
import com.tencent.mm.pluginsdk.ui.d.c;
import com.tencent.mm.pluginsdk.ui.d.c.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class SnsTransparentUI
  extends MMActivity
{
  private Map<String, Bitmap> pHx;
  
  public SnsTransparentUI()
  {
    GMTrace.i(15284446429184L, 113878);
    this.pHx = new HashMap();
    GMTrace.o(15284446429184L, 113878);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15284580646912L, 113879);
    GMTrace.o(15284580646912L, 113879);
    return -1;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(15284714864640L, 113880);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    final Object localObject = getIntent();
    if (localObject != null) {
      switch (((Intent)localObject).getIntExtra("op", -1))
      {
      }
    }
    for (;;)
    {
      GMTrace.o(15284714864640L, 113880);
      return;
      paramBundle = ((Intent)localObject).getStringExtra("adlandingXml");
      final String str1 = ((Intent)localObject).getStringExtra("shareTitle");
      final String str2 = ((Intent)localObject).getStringExtra("shareThumbUrl");
      final String str3 = ((Intent)localObject).getStringExtra("shareDesc");
      final String str4 = ((Intent)localObject).getStringExtra("shareUrl");
      localObject = ((Intent)localObject).getStringExtra("statExtStr");
      w.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI");
      Intent localIntent = new Intent();
      localIntent.putExtra("Select_Conv_Type", 259);
      localIntent.putExtra("select_is_ret", true);
      com.tencent.mm.bj.d.a(this, ".ui.transmit.SelectConversationUI", localIntent, 0, new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final Intent paramAnonymousIntent)
        {
          GMTrace.i(15279211937792L, 113839);
          if (paramAnonymousInt2 == -1)
          {
            if (paramAnonymousIntent == null) {}
            for (paramAnonymousIntent = null; (paramAnonymousIntent == null) || (paramAnonymousIntent.length() == 0); paramAnonymousIntent = paramAnonymousIntent.getStringExtra("Select_Conv_User"))
            {
              w.e("SnsTransparentUI", "mmOnActivityResult fail, toUser is null");
              SnsTransparentUI.this.finish();
              GMTrace.o(15279211937792L, 113839);
              return;
            }
            w.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI is ok");
            final String str = paramBundle;
            final SnsTransparentUI localSnsTransparentUI = SnsTransparentUI.this;
            r.a.txX.a(((MMActivity)localSnsTransparentUI).vKB, str1, str2, str3, localSnsTransparentUI.getResources().getString(i.j.cUs), new o.a()
            {
              public final void a(boolean paramAnonymous2Boolean, final String paramAnonymous2String, int paramAnonymous2Int)
              {
                GMTrace.i(15292767928320L, 113940);
                if (paramAnonymous2Boolean)
                {
                  final Object localObject1 = new WXMediaMessage();
                  ((WXMediaMessage)localObject1).title = SnsTransparentUI.1.this.qiC;
                  ((WXMediaMessage)localObject1).description = SnsTransparentUI.1.this.qiE;
                  Object localObject2 = new WXWebpageObject();
                  ((WXWebpageObject)localObject2).canvasPageXml = str;
                  ((WXWebpageObject)localObject2).webpageUrl = SnsTransparentUI.1.this.qiF;
                  ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
                  if (SnsTransparentUI.a(SnsTransparentUI.this).containsKey(SnsTransparentUI.1.this.qiD))
                  {
                    localObject2 = (Bitmap)SnsTransparentUI.a(SnsTransparentUI.this).get(SnsTransparentUI.1.this.qiD);
                    if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
                    {
                      w.i("SnsTransparentUI", "thumb image is not null");
                      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
                      ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
                      ((WXMediaMessage)localObject1).thumbData = localByteArrayOutputStream.toByteArray();
                    }
                    localObject2 = new oj();
                    ((oj)localObject2).eTm.eLU = ((WXMediaMessage)localObject1);
                    ((oj)localObject2).eTm.toUser = paramAnonymousIntent;
                    ((oj)localObject2).eTm.eTn = 49;
                    ((oj)localObject2).eTm.eTo = "";
                    ((oj)localObject2).eTm.eTp = "";
                    ((oj)localObject2).eTm.eTv = SnsTransparentUI.1.this.qiG;
                    com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
                    if (!TextUtils.isEmpty(paramAnonymous2String))
                    {
                      localObject1 = new ol();
                      ((ol)localObject1).eTx.eTy = paramAnonymousIntent;
                      ((ol)localObject1).eTx.content = paramAnonymous2String;
                      ((ol)localObject1).eTx.type = s.go(paramAnonymousIntent);
                      ((ol)localObject1).eTx.flags = 0;
                      com.tencent.mm.sdk.b.a.vgX.m((b)localObject1);
                    }
                    h.bm(localSnsTransparentUI, localSnsTransparentUI.getString(i.j.cUy));
                    SnsTransparentUI.this.finish();
                    GMTrace.o(15292767928320L, 113940);
                    return;
                  }
                  aa.RP(SnsTransparentUI.1.this.qiD);
                  com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", SnsTransparentUI.1.this.qiD, false, 1000000001, 0, new d.a()
                  {
                    public final void Ih(String paramAnonymous3String)
                    {
                      GMTrace.i(15299344596992L, 113989);
                      try
                      {
                        paramAnonymous3String = BitmapFactory.decodeFile(paramAnonymous3String);
                        SnsTransparentUI.a(SnsTransparentUI.this).put(SnsTransparentUI.1.this.qiD, paramAnonymous3String);
                        if ((paramAnonymous3String != null) && (!paramAnonymous3String.isRecycled()))
                        {
                          w.i("SnsTransparentUI", "thumb image is not null");
                          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
                          paramAnonymous3String.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
                          localObject1.thumbData = localByteArrayOutputStream.toByteArray();
                        }
                        paramAnonymous3String = new oj();
                        paramAnonymous3String.eTm.eLU = localObject1;
                        paramAnonymous3String.eTm.toUser = SnsTransparentUI.1.1.this.etX;
                        paramAnonymous3String.eTm.eTn = 49;
                        paramAnonymous3String.eTm.eTo = "";
                        paramAnonymous3String.eTm.eTp = "";
                        paramAnonymous3String.eTm.eTv = SnsTransparentUI.1.this.qiG;
                        com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous3String);
                        if (!TextUtils.isEmpty(paramAnonymous2String))
                        {
                          paramAnonymous3String = new ol();
                          paramAnonymous3String.eTx.eTy = SnsTransparentUI.1.1.this.etX;
                          paramAnonymous3String.eTx.content = paramAnonymous2String;
                          paramAnonymous3String.eTx.type = s.go(SnsTransparentUI.1.1.this.etX);
                          paramAnonymous3String.eTx.flags = 0;
                          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous3String);
                        }
                        h.bm(SnsTransparentUI.1.1.this.val$context, SnsTransparentUI.1.1.this.val$context.getString(i.j.cUy));
                        SnsTransparentUI.this.finish();
                        GMTrace.o(15299344596992L, 113989);
                        return;
                      }
                      catch (Exception paramAnonymous3String)
                      {
                        w.e("SnsTransparentUI", "this has a error : " + paramAnonymous3String.toString());
                        SnsTransparentUI.this.finish();
                        GMTrace.o(15299344596992L, 113989);
                      }
                    }
                    
                    public final void bkK()
                    {
                      GMTrace.i(15299076161536L, 113987);
                      GMTrace.o(15299076161536L, 113987);
                    }
                    
                    public final void bkL()
                    {
                      GMTrace.i(15299210379264L, 113988);
                      GMTrace.o(15299210379264L, 113988);
                    }
                  });
                  GMTrace.o(15292767928320L, 113940);
                  return;
                }
                SnsTransparentUI.this.finish();
                GMTrace.o(15292767928320L, 113940);
              }
            });
            GMTrace.o(15279211937792L, 113839);
            return;
          }
          SnsTransparentUI.this.finish();
          GMTrace.o(15279211937792L, 113839);
        }
      });
      GMTrace.o(15284714864640L, 113880);
      return;
      paramBundle = ((Intent)localObject).getStringExtra("phoneNum");
      c.a.tDL.a(this, paramBundle, new DialogInterface.OnDismissListener()new Bundle
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(20833544175616L, 155222);
          ab.dg(SnsTransparentUI.this);
          SnsTransparentUI.this.finish();
          GMTrace.o(20833544175616L, 155222);
        }
      }, new Bundle());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsTransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */