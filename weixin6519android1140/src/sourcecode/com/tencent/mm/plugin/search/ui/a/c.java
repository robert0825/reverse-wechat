package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.d.a;
import com.tencent.mm.plugin.fts.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  extends a
{
  public List<String> hWm;
  public CharSequence oDZ;
  private b oEa;
  a oEb;
  
  public c(int paramInt)
  {
    super(17, paramInt);
    GMTrace.i(11851828035584L, 88303);
    this.oEa = new b();
    this.oEb = new a();
    GMTrace.o(11851828035584L, 88303);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16470394273792L, 122714);
    b localb = this.oEa;
    GMTrace.o(16470394273792L, 122714);
    return localb;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18366353899520L, 136840);
    a locala = this.oEb;
    GMTrace.o(18366353899520L, 136840);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16470260056064L, 122713);
    parama = new SpannableStringBuilder();
    paramVarArgs = this.hWm.iterator();
    while (paramVarArgs.hasNext())
    {
      String str = (String)paramVarArgs.next();
      SpannableString localSpannableString = new SpannableString(str);
      localSpannableString.setSpan(new ForegroundColorSpan(d.a.lzq), 0, str.length(), 33);
      parama.append(localSpannableString);
      parama.append("、");
    }
    this.oDZ = TextUtils.concat(new CharSequence[] { paramContext.getString(R.l.dWV), parama.subSequence(0, parama.length() - 1), paramContext.getString(R.l.dWU) });
    GMTrace.o(16470260056064L, 122713);
  }
  
  private final class a
    extends a.a
  {
    public TextView hqI;
    
    public a()
    {
      super();
      GMTrace.i(11854512390144L, 88323);
      GMTrace.o(11854512390144L, 88323);
    }
  }
  
  private final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(11846727761920L, 88265);
      GMTrace.o(11846727761920L, 88265);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11846861979648L, 88266);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxH, paramViewGroup, false);
      paramViewGroup = (c.a)c.this.oEb;
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11846861979648L, 88266);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16474689241088L, 122746);
      paramContext = (c.a)parama;
      e.a(c.this.oDZ, paramContext.hqI);
      GMTrace.o(16474689241088L, 122746);
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(16474823458816L, 122747);
      paramVarArgs = new Intent();
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(c.this.hWm);
      paramVarArgs.putExtra("query_phrase_list", localArrayList);
      paramVarArgs.putExtra("go_to_chatroom_direct", true);
      paramVarArgs.putExtra("scene_from", 3);
      d.a(paramContext, ".ui.transmit.MMCreateChatroomUI", paramVarArgs);
      GMTrace.o(16474823458816L, 122747);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */