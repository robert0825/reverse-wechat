package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.bb;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.ArrayList;

public class ProfileLabelView
  extends ProfileItemView
{
  public TextView nMn;
  public TextView tup;
  
  public ProfileLabelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1171989200896L, 8732);
    GMTrace.o(1171989200896L, 8732);
  }
  
  public ProfileLabelView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1172123418624L, 8733);
    GMTrace.o(1172123418624L, 8733);
  }
  
  public final int aXW()
  {
    GMTrace.i(1172257636352L, 8734);
    int i = R.i.cDL;
    GMTrace.o(1172257636352L, 8734);
    return i;
  }
  
  public final boolean aXX()
  {
    GMTrace.i(1172526071808L, 8736);
    if (this.tup != null)
    {
      localObject = this.tup.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = com.tencent.mm.br.a.V(getContext(), R.f.aQg);
      this.tup.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    ArrayList localArrayList;
    if (com.tencent.mm.l.a.eE(this.kse.field_type))
    {
      if (q.fp(this.kse.field_username))
      {
        setVisibility(8);
        GMTrace.o(1172526071808L, 8736);
        return false;
      }
      localObject = this.kse.field_contactLabelIds;
      localArrayList = (ArrayList)com.tencent.mm.plugin.label.a.a.aJP().AX((String)localObject);
      if ((!bg.nm((String)localObject)) && (localArrayList != null) && (localArrayList.size() > 0))
      {
        this.nMn.setText(h.a(getContext(), bg.c(localArrayList, getContext().getResources().getString(R.l.dil))));
        GMTrace.o(1172526071808L, 8736);
        return true;
      }
      setVisibility(8);
      GMTrace.o(1172526071808L, 8736);
      return false;
    }
    Object localObject = this.kse.field_encryptUsername;
    if (!bg.nm((String)localObject)) {
      at.AR();
    }
    for (localObject = c.yL().CC((String)localObject); localObject != null; localObject = c.yL().CC(this.kse.field_username))
    {
      localObject = ((bb)localObject).field_contactLabels;
      localArrayList = (ArrayList)com.tencent.mm.plugin.label.a.a.aJP().AW((String)localObject);
      if ((bg.nm((String)localObject)) || (localArrayList == null) || (localArrayList.size() <= 0)) {
        break;
      }
      this.nMn.setText(h.a(getContext(), bg.c(localArrayList, getContext().getResources().getString(R.l.dil))));
      GMTrace.o(1172526071808L, 8736);
      return true;
      at.AR();
    }
    setVisibility(8);
    GMTrace.o(1172526071808L, 8736);
    return false;
  }
  
  public final void init()
  {
    GMTrace.i(1172391854080L, 8735);
    this.nMn = ((TextView)findViewById(R.h.bqF));
    this.tup = ((TextView)findViewById(R.h.bqG));
    setClickable(true);
    GMTrace.o(1172391854080L, 8735);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\ProfileLabelView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */