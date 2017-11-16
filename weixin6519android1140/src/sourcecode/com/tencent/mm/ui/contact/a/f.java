package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.d.a;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;

public final class f
  extends a
{
  public String[] lxa;
  public CharSequence oDZ;
  private a.b wUZ;
  a.a wVa;
  
  public f(int paramInt)
  {
    super(5, paramInt);
    GMTrace.i(1772076662784L, 13203);
    this.wUZ = new b();
    this.wVa = new a();
    GMTrace.o(1772076662784L, 13203);
  }
  
  public final a.b PV()
  {
    GMTrace.i(1772345098240L, 13205);
    a.b localb = this.wUZ;
    GMTrace.o(1772345098240L, 13205);
    return localb;
  }
  
  protected final a.a PW()
  {
    GMTrace.i(1772479315968L, 13206);
    a.a locala = this.wVa;
    GMTrace.o(1772479315968L, 13206);
    return locala;
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(1772210880512L, 13204);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    String[] arrayOfString = this.lxa;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      SpannableString localSpannableString = new SpannableString(str);
      localSpannableString.setSpan(new ForegroundColorSpan(d.a.lzq), 0, str.length(), 33);
      localSpannableStringBuilder.append(localSpannableString);
      localSpannableStringBuilder.append("、");
      i += 1;
    }
    this.oDZ = TextUtils.concat(new CharSequence[] { paramContext.getString(a.h.oFI), localSpannableStringBuilder.subSequence(0, localSpannableStringBuilder.length() - 1), paramContext.getString(a.h.oFI) });
    GMTrace.o(1772210880512L, 13204);
  }
  
  public final class a
    extends a.a
  {
    public TextView hqI;
    public View wVb;
    
    public a()
    {
      super();
      GMTrace.i(1776908500992L, 13239);
      GMTrace.o(1776908500992L, 13239);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(1770600267776L, 13192);
      GMTrace.o(1770600267776L, 13192);
    }
    
    public final boolean PX()
    {
      GMTrace.i(1771002920960L, 13195);
      GMTrace.o(1771002920960L, 13195);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(1770734485504L, 13193);
      paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFv, paramViewGroup, false);
      paramViewGroup = (f.a)f.this.wVa;
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(a.e.bti));
      paramViewGroup.wVb = paramContext.findViewById(a.e.oFh);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(1770734485504L, 13193);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(1770868703232L, 13194);
      paramContext = (f.a)parama;
      e.a(((f)parama1).oDZ, paramContext.hqI);
      if (f.this.position == 0)
      {
        paramContext.wVb.setVisibility(8);
        GMTrace.o(1770868703232L, 13194);
        return;
      }
      paramContext.wVb.setVisibility(0);
      GMTrace.o(1770868703232L, 13194);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */