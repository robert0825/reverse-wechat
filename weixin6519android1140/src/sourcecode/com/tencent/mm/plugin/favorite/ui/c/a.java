package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.List;
import java.util.Map;

public abstract class a
{
  protected g laj;
  public final a ljH;
  
  public a(g paramg)
  {
    GMTrace.i(6425673728000L, 47875);
    this.laj = null;
    this.ljH = new a();
    this.laj = paramg;
    GMTrace.o(6425673728000L, 47875);
  }
  
  public abstract View a(View paramView, ViewGroup paramViewGroup, j paramj);
  
  protected final View a(View paramView, b paramb, j paramj)
  {
    GMTrace.i(6426076381184L, 47878);
    if (paramView == null) {
      throw new NullPointerException("base item view is null");
    }
    paramb.hqG = ((ImageView)paramView.findViewById(R.h.byx));
    if (paramb.hqG == null) {
      throw new IllegalArgumentException("base item view do not contain id named fav_avatar");
    }
    paramb.jUm = ((TextView)paramView.findViewById(R.h.bzh));
    if (paramb.jUm == null) {
      throw new IllegalArgumentException("base item view do not contain id named fav_name");
    }
    paramb.jRw = ((TextView)paramView.findViewById(R.h.bzv));
    if (paramb.jRw == null) {
      throw new IllegalArgumentException("base item view do not contain id named fav_time");
    }
    paramb.hqJ = ((CheckBox)paramView.findViewById(R.h.byC));
    if (paramb.hqJ == null) {
      throw new IllegalArgumentException("base item view do not contain id named checkbox");
    }
    paramb.ljK = ((TextView)paramView.findViewById(R.h.bzd));
    paramb.hqJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6427955429376L, 47892);
        if (paramAnonymousCompoundButton.getTag() == null)
        {
          GMTrace.o(6427955429376L, 47892);
          return;
        }
        paramAnonymousCompoundButton = (j)paramAnonymousCompoundButton.getTag();
        if (paramAnonymousBoolean)
        {
          j localj = com.tencent.mm.plugin.favorite.h.axB().cf(paramAnonymousCompoundButton.field_localId);
          a.this.ljH.lfY.put(Long.valueOf(paramAnonymousCompoundButton.field_localId), localj);
        }
        for (;;)
        {
          if (a.this.ljH.ljJ != null) {
            a.this.ljH.ljJ.cv(paramAnonymousCompoundButton.field_localId);
          }
          GMTrace.o(6427955429376L, 47892);
          return;
          a.this.ljH.lfY.remove(Long.valueOf(paramAnonymousCompoundButton.field_localId));
        }
      }
    });
    paramb.lcn = paramj;
    paramView.setTag(paramb);
    paramb.ljL = ((LinearLayout)paramView.findViewById(R.h.bzq));
    paramb.ljM = ((TextView)paramView.findViewById(R.h.bzp));
    paramb.ljM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6423123591168L, 47856);
        w.d("MicroMsg.FavBaseListItem", "manual restart upload");
        if ((paramAnonymousView.getTag() instanceof j)) {
          com.tencent.mm.plugin.favorite.b.x.l((j)paramAnonymousView.getTag());
        }
        GMTrace.o(6423123591168L, 47856);
      }
    });
    GMTrace.o(6426076381184L, 47878);
    return paramView;
  }
  
  protected final void a(b paramb, j paramj)
  {
    GMTrace.i(6426210598912L, 47879);
    paramb.lcn = paramj;
    Object localObject = paramb.lcn.field_favProto.ulz;
    label87:
    Context localContext;
    label231:
    boolean bool;
    if ((localObject != null) && (!bg.nm(((tw)localObject).ulb)))
    {
      com.tencent.mm.pluginsdk.ui.a.b.n(paramb.hqG, ((tw)localObject).ulb);
      if (this.ljH.lgf) {
        break label411;
      }
      paramb.jRw.setText(u.d(paramb.jRw.getContext(), paramb.lcn.field_updateTime));
      localContext = paramb.jUm.getContext();
      at.AR();
      localObject = com.tencent.mm.y.c.yK().TD(paramb.lcn.field_fromUser);
      if ((localObject != null) && (((af)localObject).field_username.equals(paramb.lcn.field_fromUser))) {
        break label431;
      }
      w.w("MicroMsg.FavBaseListItem", "render name, user is %s, but name is null", new Object[] { paramb.lcn.field_fromUser });
      paramb.jUm.setText("");
      ak.a.gmX.a(paramb.lcn.field_fromUser, "", null);
      w.d("MicroMsg.FavBaseListItem", "status %s", new Object[] { Integer.valueOf(paramb.lcn.field_itemStatus) });
      if (!paramb.lcn.axK()) {
        break label532;
      }
      paramb.ljL.setVisibility(0);
      paramb.hqJ.setTag(paramj);
      if ((!this.ljH.lfX) && (!this.ljH.lgf)) {
        break label549;
      }
      paramb.hqJ.setVisibility(0);
      localObject = paramb.hqJ;
      if (this.ljH.lfY.get(Long.valueOf(paramj.field_localId)) == null) {
        break label544;
      }
      bool = true;
      label297:
      ((CheckBox)localObject).setChecked(bool);
      label303:
      if ((paramj.field_tagProto.ulP == null) || (paramj.field_tagProto.ulP.isEmpty())) {
        break label561;
      }
      paramb.ljK.setVisibility(0);
      paramb.ljK.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramb.ljK.getContext(), com.tencent.mm.plugin.favorite.b.x.a(paramb.ljK.getContext(), paramj.field_tagProto.ulP), paramb.ljK.getTextSize()));
    }
    for (;;)
    {
      paramb.ljM.setTag(paramj);
      GMTrace.o(6426210598912L, 47879);
      return;
      com.tencent.mm.pluginsdk.ui.a.b.n(paramb.hqG, paramb.lcn.field_fromUser);
      break;
      label411:
      paramb.jRw.setText(com.tencent.mm.plugin.favorite.c.cb(paramb.lcn.field_datatotalsize));
      break label87;
      label431:
      if (s.eb(paramb.lcn.field_fromUser))
      {
        localObject = paramb.lcn.field_favProto.ulz;
        if (q.zE().equals(((tw)localObject).eMI)) {
          localObject = r.fs(((tw)localObject).toUser);
        }
      }
      for (;;)
      {
        paramb.jUm.setText(com.tencent.mm.pluginsdk.ui.d.h.b(localContext, (CharSequence)localObject, paramb.jUm.getTextSize()));
        break;
        localObject = r.fs(((tw)localObject).eMI);
        continue;
        localObject = r.a((com.tencent.mm.storage.x)localObject, ((af)localObject).field_username);
      }
      label532:
      paramb.ljL.setVisibility(8);
      break label231;
      label544:
      bool = false;
      break label297;
      label549:
      paramb.hqJ.setVisibility(8);
      break label303;
      label561:
      paramb.ljK.setVisibility(8);
    }
  }
  
  public abstract void cj(View paramView);
  
  public static final class a
  {
    public String jQT;
    public boolean jul;
    public long lastUpdateTime;
    public boolean lfX;
    public Map<Long, j> lfY;
    public boolean lgf;
    public a.c ljJ;
    
    public a()
    {
      GMTrace.i(6434129444864L, 47938);
      GMTrace.o(6434129444864L, 47938);
    }
    
    public final String toString()
    {
      GMTrace.i(6434263662592L, 47939);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("lastUpdateTime:").append(this.lastUpdateTime).append('\n');
      ((StringBuilder)localObject).append("isSearching:").append(this.jul).append('\n');
      ((StringBuilder)localObject).append("search str:").append(this.jQT).append('\n');
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(6434263662592L, 47939);
      return (String)localObject;
    }
  }
  
  public static class b
  {
    public ImageView hqG;
    public CheckBox hqJ;
    public TextView jRw;
    public TextView jUm;
    public j lcn;
    public TextView ljK;
    public LinearLayout ljL;
    public TextView ljM;
    
    public b()
    {
      GMTrace.i(6432653049856L, 47927);
      GMTrace.o(6432653049856L, 47927);
    }
  }
  
  public static abstract interface c
  {
    public abstract void cv(long paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */