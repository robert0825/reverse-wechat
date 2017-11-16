package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.bb;
import com.tencent.mm.ui.widget.e;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class ProfileDescribeView
  extends ProfileItemView
{
  public TextView tuf;
  public TextView tug;
  
  public ProfileDescribeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1034147594240L, 7705);
    GMTrace.o(1034147594240L, 7705);
  }
  
  public ProfileDescribeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1034281811968L, 7706);
    GMTrace.o(1034281811968L, 7706);
  }
  
  public final int aXW()
  {
    GMTrace.i(1034416029696L, 7707);
    int i = R.i.cDI;
    GMTrace.o(1034416029696L, 7707);
    return i;
  }
  
  public final boolean aXX()
  {
    GMTrace.i(1034684465152L, 7709);
    if (this.tug != null)
    {
      localObject1 = this.tug.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.br.a.V(getContext(), R.f.aQg);
      this.tug.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    if (this.kse == null)
    {
      setVisibility(8);
      GMTrace.o(1034684465152L, 7709);
      return false;
    }
    Object localObject2 = this.kse.fjt;
    int i;
    if (!bg.nm(this.kse.fju)) {
      i = 1;
    }
    while (com.tencent.mm.l.a.eE(this.kse.field_type)) {
      if ((!bg.nm((String)localObject2)) && (i != 0))
      {
        Drawable localDrawable = getContext().getResources().getDrawable(R.k.cLa);
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        localObject1 = new e(localDrawable);
        ((e)localObject1).xpz = ((int)((localDrawable.getIntrinsicHeight() - this.tuf.getTextSize()) / 2.0F));
        localObject2 = new SpannableString("  " + (String)localObject2);
        ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
        this.tuf.setText(h.b(getContext(), (CharSequence)localObject2, this.tuf.getTextSize()));
        GMTrace.o(1034684465152L, 7709);
        return true;
        i = 0;
      }
      else
      {
        if ((!bg.nm((String)localObject2)) && (i == 0))
        {
          this.tuf.setText(h.b(getContext(), bg.nl((String)localObject2), this.tuf.getTextSize()));
          GMTrace.o(1034684465152L, 7709);
          return true;
        }
        if ((bg.nm((String)localObject2)) && (i != 0))
        {
          localObject2 = getContext().getResources().getDrawable(R.k.cLa);
          ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getIntrinsicWidth(), ((Drawable)localObject2).getIntrinsicHeight());
          localObject1 = new e((Drawable)localObject2);
          ((e)localObject1).xpz = ((int)((((Drawable)localObject2).getIntrinsicHeight() - this.tuf.getTextSize()) / 2.0F));
          localObject2 = new SpannableString("  " + getContext().getString(R.l.dkz));
          ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
          this.tuf.setText(h.b(getContext(), (CharSequence)localObject2, this.tuf.getTextSize()));
          GMTrace.o(1034684465152L, 7709);
          return true;
        }
        if ((bg.nm((String)localObject2)) && (i == 0))
        {
          setVisibility(8);
          GMTrace.o(1034684465152L, 7709);
          return false;
        }
        setVisibility(8);
        GMTrace.o(1034684465152L, 7709);
        return false;
      }
    }
    Object localObject1 = this.kse.field_encryptUsername;
    if (!bg.nm((String)localObject1)) {
      at.AR();
    }
    for (localObject1 = c.yL().CC((String)localObject1); (localObject1 != null) && (!bg.nm(((bb)localObject1).field_conDescription)); localObject1 = c.yL().CC(this.kse.field_username))
    {
      this.tuf.setText(h.b(getContext(), bg.nl(((bb)localObject1).field_conDescription), this.tuf.getTextSize()));
      GMTrace.o(1034684465152L, 7709);
      return true;
      at.AR();
    }
    setVisibility(8);
    GMTrace.o(1034684465152L, 7709);
    return false;
  }
  
  public final void init()
  {
    GMTrace.i(1034550247424L, 7708);
    this.tuf = ((TextView)findViewById(R.h.bqy));
    this.tug = ((TextView)findViewById(R.h.bqz));
    setClickable(true);
    GMTrace.o(1034550247424L, 7708);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\ProfileDescribeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */