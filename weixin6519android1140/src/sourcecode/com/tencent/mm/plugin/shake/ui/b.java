package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bc.j;
import com.tencent.mm.bc.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.o;

final class b
  extends o<j>
{
  private int aCN;
  private MMActivity ezR;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.d jpT;
  protected MMSlideDelView.e nuM;
  private k oOO;
  
  public b(Context paramContext, k paramk, int paramInt)
  {
    super(paramContext, new j());
    GMTrace.i(6544724852736L, 48762);
    this.aCN = -1;
    this.jpT = MMSlideDelView.cah();
    this.ezR = ((MMActivity)paramContext);
    this.aCN = paramInt;
    this.oOO = paramk;
    GMTrace.o(6544724852736L, 48762);
  }
  
  public final void QF()
  {
    GMTrace.i(6545530159104L, 48768);
    k localk = this.oOO;
    int i = this.aCN;
    String str = "SELECT * FROM " + localk.getTableName() + " where isSend = 0 ORDER BY createtime desc LIMIT " + i;
    setCursor(localk.fTZ.rawQuery(str, null));
    super.notifyDataSetChanged();
    GMTrace.o(6545530159104L, 48768);
  }
  
  protected final void QG()
  {
    GMTrace.i(6545395941376L, 48767);
    QF();
    GMTrace.o(6545395941376L, 48767);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(6545127505920L, 48765);
    this.jpR = paramc;
    GMTrace.o(6545127505920L, 48765);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(6544993288192L, 48764);
    this.nuM = parame;
    GMTrace.o(6544993288192L, 48764);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(6544859070464L, 48763);
    this.jpQ = paramf;
    GMTrace.o(6544859070464L, 48763);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6545664376832L, 48769);
    j localj = (j)getItem(paramInt);
    Object localObject;
    if (paramView == null)
    {
      paramView = (MMSlideDelView)View.inflate(this.ezR, R.i.cpV, null);
      paramViewGroup = new a();
      localObject = View.inflate(this.ezR, R.i.cEV, null);
      paramViewGroup.hqg = ((ImageView)((View)localObject).findViewById(R.h.brE));
      paramViewGroup.gDd = ((TextView)((View)localObject).findViewById(R.h.bux));
      paramViewGroup.mTK = ((TextView)((View)localObject).findViewById(R.h.bZu));
      paramViewGroup.jqa = paramView.findViewById(R.h.cfd);
      paramViewGroup.jqb = ((TextView)paramView.findViewById(R.h.cfe));
      paramView.setView((View)localObject);
      paramView.jpQ = this.jpQ;
      paramView.jpR = this.jpR;
      paramView.jpT = this.jpT;
      paramView.lmH = false;
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.jqa.setTag(Long.valueOf(localj.field_svrid));
      paramViewGroup.jqa.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6588614049792L, 49089);
          w.v("MicroMsg.SayHiAdapter", "on delView clicked");
          b.this.jpT.aJq();
          if (b.this.nuM != null) {
            b.this.nuM.aV(paramAnonymousView.getTag());
          }
          GMTrace.o(6588614049792L, 49089);
        }
      });
      localObject = au.d.Uk(localj.field_content);
      paramViewGroup.gDd.setText(h.b(this.ezR, ((au.d)localObject).getDisplayName(), paramViewGroup.gDd.getTextSize()));
      paramViewGroup.mTK.setText(localj.field_sayhicontent);
      a.b.a(paramViewGroup.hqg, localj.field_sayhiuser);
      GMTrace.o(6545664376832L, 48769);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void tS(int paramInt)
  {
    GMTrace.i(6545261723648L, 48766);
    aJe();
    this.aCN = paramInt;
    QF();
    GMTrace.o(6545261723648L, 48766);
  }
  
  static final class a
  {
    TextView gDd;
    ImageView hqg;
    View jqa;
    TextView jqb;
    TextView mTK;
    
    a()
    {
      GMTrace.i(6540564103168L, 48731);
      GMTrace.o(6540564103168L, 48731);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */