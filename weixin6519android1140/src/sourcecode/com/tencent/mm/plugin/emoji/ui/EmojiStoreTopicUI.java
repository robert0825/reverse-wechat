package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;

public class EmojiStoreTopicUI
  extends BaseEmojiStoreUI
{
  private int gRb;
  private int kqD;
  private String kqE;
  private String kqF;
  private String kqG;
  private String kqH;
  private String kqI;
  
  public EmojiStoreTopicUI()
  {
    GMTrace.i(11536684810240L, 85955);
    GMTrace.o(11536684810240L, 85955);
  }
  
  protected final void MP()
  {
    GMTrace.i(11537221681152L, 85959);
    this.kqD = getIntent().getIntExtra("topic_id", -1);
    this.kqE = getIntent().getStringExtra("topic_name");
    this.kqH = getIntent().getStringExtra("topic_ad_url");
    this.kqF = getIntent().getStringExtra("topic_icon_url");
    this.kqG = getIntent().getStringExtra("topic_desc");
    this.kqI = getIntent().getStringExtra("sns_object_data");
    this.gRb = getIntent().getIntExtra("extra_scence", 0);
    if (!bg.nm(this.kqI))
    {
      this.kqD = EmojiLogic.wd(this.kqI);
      this.kqE = EmojiLogic.we(this.kqI);
      this.kqF = EmojiLogic.wg(this.kqI);
      this.kqG = EmojiLogic.wf(this.kqI);
      this.kqH = EmojiLogic.wh(this.kqI);
    }
    sq(this.kqE);
    super.MP();
    a(0, R.k.cNO, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11387971567616L, 84847);
        w.d("MicroMsg.emoji.EmojiStoreTopicUI", "on shard click.");
        if ((!bg.nm(EmojiStoreTopicUI.a(EmojiStoreTopicUI.this))) && (!bg.nm(EmojiStoreTopicUI.b(EmojiStoreTopicUI.this)))) {
          EmojiStoreTopicUI.c(EmojiStoreTopicUI.this);
        }
        for (;;)
        {
          GMTrace.o(11387971567616L, 84847);
          return true;
          w.i("MicroMsg.emoji.EmojiStoreTopicUI", "name or url is null.");
        }
      }
    });
    Z(0, false);
    wq(this.kqH);
    GMTrace.o(11537221681152L, 85959);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11536953245696L, 85957);
    GMTrace.o(11536953245696L, 85957);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11539234947072L, 85974);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if (this.knh)
    {
      Z(0, false);
      GMTrace.o(11539234947072L, 85974);
      return;
    }
    Z(0, true);
    GMTrace.o(11539234947072L, 85974);
  }
  
  protected final void a(e parame, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(11537624334336L, 85962);
    super.a(parame, paramBoolean1, paramBoolean2);
    GMTrace.o(11537624334336L, 85962);
  }
  
  protected final void a(boolean paramBoolean1, e parame, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(11537892769792L, 85964);
    super.a(paramBoolean1, parame, paramBoolean2, paramBoolean3);
    GMTrace.o(11537892769792L, 85964);
  }
  
  protected final void arN()
  {
    GMTrace.i(11536819027968L, 85956);
    super.arN();
    GMTrace.o(11536819027968L, 85956);
  }
  
  protected final int arO()
  {
    GMTrace.i(11538966511616L, 85972);
    GMTrace.o(11538966511616L, 85972);
    return 11;
  }
  
  protected final int arP()
  {
    GMTrace.i(11539100729344L, 85973);
    GMTrace.o(11539100729344L, 85973);
    return 14;
  }
  
  protected final com.tencent.mm.plugin.emoji.a.a.a arQ()
  {
    GMTrace.i(11538429640704L, 85968);
    com.tencent.mm.plugin.emoji.a.f localf = new com.tencent.mm.plugin.emoji.a.f(this.vKB.vKW);
    GMTrace.o(11538429640704L, 85968);
    return localf;
  }
  
  protected final boolean arU()
  {
    GMTrace.i(11538698076160L, 85970);
    GMTrace.o(11538698076160L, 85970);
    return false;
  }
  
  protected final boolean arV()
  {
    GMTrace.i(11538563858432L, 85969);
    if (bg.nm(this.kqH))
    {
      GMTrace.o(11538563858432L, 85969);
      return false;
    }
    GMTrace.o(11538563858432L, 85969);
    return true;
  }
  
  protected final int arX()
  {
    GMTrace.i(11538026987520L, 85965);
    GMTrace.o(11538026987520L, 85965);
    return 7;
  }
  
  public final int arY()
  {
    GMTrace.i(11538161205248L, 85966);
    int i = this.kqD;
    GMTrace.o(11538161205248L, 85966);
    return i;
  }
  
  protected final boolean asf()
  {
    GMTrace.i(11538295422976L, 85967);
    GMTrace.o(11538295422976L, 85967);
    return false;
  }
  
  public final void h(Message paramMessage)
  {
    GMTrace.i(11538832293888L, 85971);
    super.h(paramMessage);
    if (paramMessage.what == 1009) {
      wq(this.kqH);
    }
    GMTrace.o(11538832293888L, 85971);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11537758552064L, 85963);
    ase();
    if ((paramInt1 == 2002) && (paramInt2 == -1))
    {
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      if (!bg.nm(str1))
      {
        w.d("MicroMsg.emoji.EmojiStoreTopicUI", ".." + str1);
        int i = this.kqD;
        String str2 = this.kqE;
        String str3 = this.kqG;
        String str4 = this.kqF;
        String str5 = this.kqH;
        h.arh();
        com.tencent.mm.plugin.emoji.e.k.a(this, str1, 26, i, str2, str3, str4, str5, 0, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(11537758552064L, 85963);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11537087463424L, 85958);
    super.onCreate(paramBundle);
    g.ork.i(12740, new Object[] { Integer.valueOf(3), "", "", Integer.valueOf(this.kqD), Integer.valueOf(this.gRb) });
    GMTrace.o(11537087463424L, 85958);
  }
  
  protected void onResume()
  {
    GMTrace.i(11537490116608L, 85961);
    super.onResume();
    GMTrace.o(11537490116608L, 85961);
  }
  
  protected final void wq(String paramString)
  {
    GMTrace.i(11537355898880L, 85960);
    if ((this.knd != null) && (this.kne != null) && (!bg.nm(paramString)))
    {
      com.tencent.mm.br.a.getDensity(this);
      EmojiInfo localEmojiInfo = EmojiLogic.a("Toptic", 8, paramString, true);
      if (localEmojiInfo == null)
      {
        com.tencent.mm.ao.n.Jd().a(paramString, null, com.tencent.mm.plugin.emoji.e.f.c("Toptic", paramString, new Object[] { "Toptic", "BANNER" }), new i()
        {
          public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
          {
            GMTrace.i(11367302037504L, 84693);
            paramAnonymousString = EmojiStoreTopicUI.this;
            if (paramAnonymousString.koj != null) {
              paramAnonymousString.koj.sendEmptyMessage(1009);
            }
            GMTrace.o(11367302037504L, 84693);
          }
        });
        GMTrace.o(11537355898880L, 85960);
        return;
      }
      this.kne.cz(localEmojiInfo.bUU(), null);
    }
    GMTrace.o(11537355898880L, 85960);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiStoreTopicUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */