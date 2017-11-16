package com.tencent.mm.ui.chatting.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.aw.b;
import com.tencent.mm.aw.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.chatting.cv;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
{
  private Bitmap wIg;
  private ImageView wIh;
  public final j.a wIi;
  public h wtd;
  
  public a(h paramh)
  {
    GMTrace.i(19208435924992L, 143114);
    this.wIi = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(19217025859584L, 143178);
        w.d("MicroMsg.ChattingUI.BackgroundImp", "onBGChange event:%s", new Object[] { paramAnonymousString });
        if ((paramAnonymousString != null) && ((paramAnonymousString.equals(a.this.wtd.cci())) || (paramAnonymousString.equals("*")))) {
          a.this.bDL();
        }
        GMTrace.o(19217025859584L, 143178);
      }
    };
    this.wtd = paramh;
    GMTrace.o(19208435924992L, 143114);
  }
  
  private int cez()
  {
    GMTrace.i(19208704360448L, 143116);
    int i = this.wtd.cdg().bXK().getColor(R.e.aNm);
    GMTrace.o(19208704360448L, 143116);
    return i;
  }
  
  private void setBackgroundColor(int paramInt)
  {
    GMTrace.i(19208972795904L, 143118);
    cey();
    if (this.wIh == null)
    {
      View localView = this.wtd.cdg().findViewById(R.h.bnb);
      if (localView != null) {
        localView.setBackgroundColor(paramInt);
      }
      GMTrace.o(19208972795904L, 143118);
      return;
    }
    this.wIh.setImageDrawable(new ColorDrawable(paramInt));
    GMTrace.o(19208972795904L, 143118);
  }
  
  public final void bDL()
  {
    GMTrace.i(19208838578176L, 143117);
    if (this.wtd.cdn() == null)
    {
      w.e("MicroMsg.ChattingUI.BackgroundImp", "initBackground, adapter is not initialized properly");
      GMTrace.o(19208838578176L, 143117);
      return;
    }
    Object localObject2 = com.tencent.mm.aw.t.Kk().kE(this.wtd.ccY().field_username);
    int i;
    if (localObject2 == null)
    {
      at.AR();
      i = ((Integer)c.xh().get(12311, Integer.valueOf(-2))).intValue();
    }
    while (i == -2)
    {
      setBackgroundColor(cez());
      if (this.wtd.cdn() == null)
      {
        this.wtd.cdg().finish();
        GMTrace.o(19208838578176L, 143117);
        return;
        i = ((com.tencent.mm.aw.a)localObject2).gPK;
      }
      else
      {
        this.wtd.cdn().bo(this.wtd.cdg().vKB.vKW, "chatting/purecolor_chat.xml");
        GMTrace.o(19208838578176L, 143117);
        return;
      }
    }
    com.tencent.mm.aw.t.Kj();
    int j = n.bh(this.wtd.cdg().vKB.vKW);
    if (i == 0) {
      switch (j)
      {
      default: 
        i = -1;
      }
    }
    for (;;)
    {
      if (i != -1) {
        cey();
      }
      try
      {
        this.wIg = BitmapFactory.decodeResource(this.wtd.cdg().bXL(), i);
        if (this.wIg == null)
        {
          w.e("MicroMsg.ChattingUI.BackgroundImp", "setBackground decodeFile fail, bm is null, resId = " + i);
          setBackgroundColor(this.wtd.cdg().bXL().getColor(R.e.aNm));
          this.wtd.cdn().bo(this.wtd.cdg().vKB.vKW, "chatting/reserved_chat.xml");
          GMTrace.o(19208838578176L, 143117);
          return;
          i = R.g.aVB;
        }
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
          throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
          if (this.wIh == null) {
            this.wIh = ((ImageView)this.wtd.cdg().findViewById(R.h.bna));
          }
          this.wIh.setImageBitmap(this.wIg);
        }
        Object localObject1 = com.tencent.mm.aw.t.Kj();
        if (i > 0)
        {
          localObject2 = ((n)localObject1).aU(i, 1) + "chat.xml";
          this.wtd.cdn().Wc((String)localObject2);
          switch (j)
          {
          default: 
            localObject1 = null;
          }
        }
        for (;;)
        {
          cey();
          this.wIg = j.nf((String)localObject1);
          if (this.wIg != null) {
            break;
          }
          w.e("MicroMsg.ChattingUI.BackgroundImp", "setBackground decodeFile fail, bm is null, path = " + (String)localObject1);
          setBackgroundColor(cez());
          GMTrace.o(19208838578176L, 143117);
          return;
          localObject1 = ((n)localObject1).aU(i, 1) + "horizontal_hdpi.jpg";
          continue;
          localObject1 = ((n)localObject1).aU(i, 1) + "horizontal_ldpi.jpg";
          continue;
          localObject1 = ((n)localObject1).aU(i, 1) + "vertical_hdpi.jpg";
          continue;
          localObject1 = ((n)localObject1).aU(i, 1) + "vertical_ldpi.jpg";
          continue;
          this.wtd.cdn().bo(this.wtd.cdg().vKB.vKW, "chatting/default_chat.xml");
          if (localObject2 == null) {
            localObject1 = ((n)localObject1).G("default", j);
          } else {
            localObject1 = ((n)localObject1).G(this.wtd.cci(), j);
          }
        }
        if (this.wIh == null) {
          this.wIh = ((ImageView)this.wtd.cdg().findViewById(R.h.bna));
        }
        this.wIh.setImageBitmap(this.wIg);
        GMTrace.o(19208838578176L, 143117);
        return;
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
    }
  }
  
  public final void cey()
  {
    GMTrace.i(19208570142720L, 143115);
    if (this.wIg != null)
    {
      w.i("MicroMsg.ChattingUI.BackgroundImp", "recycle bitmap:%s", new Object[] { this.wIg.toString() });
      this.wIg.recycle();
    }
    GMTrace.o(19208570142720L, 143115);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */