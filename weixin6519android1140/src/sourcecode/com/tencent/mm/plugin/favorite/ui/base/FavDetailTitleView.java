package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;

public class FavDetailTitleView
  extends LinearLayout
{
  private ImageView hqG;
  private TextView hqH;
  
  public FavDetailTitleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6445403734016L, 48022);
    GMTrace.o(6445403734016L, 48022);
  }
  
  public final void C(j paramj)
  {
    GMTrace.i(6445672169472L, 48024);
    if ((paramj == null) || (paramj.field_favProto == null))
    {
      GMTrace.o(6445672169472L, 48024);
      return;
    }
    if ((14 == paramj.field_type) && (!bg.nm(paramj.field_favProto.title)))
    {
      paramj = paramj.field_favProto.title;
      this.hqG.setVisibility(8);
    }
    for (;;)
    {
      paramj = h.b(getContext(), paramj, this.hqH.getTextSize());
      this.hqH.setText(paramj);
      GMTrace.o(6445672169472L, 48024);
      return;
      this.hqG.setVisibility(0);
      tw localtw = paramj.field_favProto.ulz;
      if ((localtw != null) && (!bg.nm(localtw.ulb)))
      {
        str1 = r.fs(localtw.ulb);
        String str2;
        if (q.zE().equals(localtw.eMI))
        {
          str2 = x.ft(localtw.toUser);
          paramj = str1;
          if (!bg.aq(str2, "").equals(localtw.toUser)) {
            paramj = str1 + " - " + str2;
          }
        }
        for (;;)
        {
          w.v("MicroMsg.FavDetailTitleView", "display name, source from[%s] to[%s]", new Object[] { localtw.eMI, localtw.toUser });
          a.b.a(this.hqG, localtw.ulb);
          break;
          str2 = x.ft(localtw.eMI);
          paramj = str1;
          if (!bg.aq(str2, "").equals(localtw.eMI)) {
            paramj = str1 + " - " + str2;
          }
        }
      }
      w.v("MicroMsg.FavDetailTitleView", "display name, from item info user[%s]", new Object[] { paramj.field_fromUser });
      String str1 = x.ft(paramj.field_fromUser);
      a.b.a(this.hqG, paramj.field_fromUser);
      paramj = str1;
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(6445537951744L, 48023);
    super.onFinishInflate();
    this.hqG = ((ImageView)findViewById(R.h.bfq));
    this.hqH = ((TextView)findViewById(R.h.chT));
    GMTrace.o(6445537951744L, 48023);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavDetailTitleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */