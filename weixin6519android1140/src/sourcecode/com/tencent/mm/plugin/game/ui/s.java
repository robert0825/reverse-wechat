package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.protocal.c.uz;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;

public final class s
  extends BaseAdapter
{
  private Context context;
  private String eBj;
  private LinkedList<a> glr;
  
  public s(Context paramContext)
  {
    GMTrace.i(12678072369152L, 94459);
    this.eBj = "";
    this.glr = new LinkedList();
    this.context = paramContext;
    GMTrace.o(12678072369152L, 94459);
  }
  
  public final void a(String paramString1, String paramString2, LinkedList<uz> paramLinkedList)
  {
    GMTrace.i(12678743457792L, 94464);
    if (bg.cc(paramLinkedList))
    {
      GMTrace.o(12678743457792L, 94464);
      return;
    }
    this.eBj = paramString1;
    this.glr.clear();
    a locala;
    if (bg.nm(paramString1))
    {
      locala = new a();
      locala.type = 1;
      if (!bg.nm(paramString2))
      {
        locala.text = paramString2;
        this.glr.add(locala);
      }
    }
    else
    {
      paramString2 = paramLinkedList.iterator();
      label86:
      if (!paramString2.hasNext()) {
        break label213;
      }
      paramLinkedList = (uz)paramString2.next();
      locala = new a();
      if (!bg.nm(paramString1)) {
        break label207;
      }
    }
    label207:
    for (int i = 2;; i = 3)
    {
      locala.type = i;
      locala.appId = paramLinkedList.lPg;
      locala.text = paramLinkedList.unm;
      locala.description = paramLinkedList.tRP;
      locala.actionType = paramLinkedList.und;
      locala.mck = paramLinkedList.une;
      this.glr.add(locala);
      break label86;
      locala.text = this.context.getString(R.l.bEV);
      break;
    }
    label213:
    notifyDataSetChanged();
    GMTrace.o(12678743457792L, 94464);
  }
  
  public final int getCount()
  {
    GMTrace.i(12678340804608L, 94461);
    int i = this.glr.size();
    GMTrace.o(12678340804608L, 94461);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(12678609240064L, 94463);
    long l = paramInt;
    GMTrace.o(12678609240064L, 94463);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12678206586880L, 94460);
    Object localObject = oU(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.czt, null);
      paramViewGroup = new b();
      paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.bEV));
      paramViewGroup.mcl = ((ViewGroup)paramViewGroup.ikm.getParent());
      paramViewGroup.mcm = ((TextView)paramView.findViewById(R.h.bEU));
      paramViewGroup.mcn = ((TextView)paramView.findViewById(R.h.bES));
      paramViewGroup.mco = ((ViewGroup)paramViewGroup.mcm.getParent());
      paramViewGroup.mcp = ((TextView)paramView.findViewById(R.h.bET));
      paramViewGroup.mcq = ((ViewGroup)paramViewGroup.mcp.getParent().getParent());
      paramView.setTag(paramViewGroup);
      switch (((a)localObject).type)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(12678206586880L, 94460);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      paramViewGroup.mcl.setVisibility(0);
      paramViewGroup.mco.setVisibility(8);
      paramViewGroup.mcq.setVisibility(8);
      paramViewGroup.mcl.setOnClickListener(null);
      paramViewGroup.ikm.setText(((a)localObject).text);
      continue;
      paramViewGroup.mcl.setVisibility(8);
      paramViewGroup.mco.setVisibility(0);
      paramViewGroup.mcq.setVisibility(8);
      paramViewGroup.mcm.setText(((a)localObject).text);
      paramViewGroup.mcn.setText(((a)localObject).description);
      continue;
      paramViewGroup.mcl.setVisibility(8);
      paramViewGroup.mco.setVisibility(8);
      paramViewGroup.mcq.setVisibility(0);
      paramInt = this.context.getResources().getColor(R.e.aOE);
      paramViewGroup.mcp.setTextColor(paramInt);
      paramInt = this.context.getResources().getColor(R.e.aNO);
      int i = ((a)localObject).text.indexOf(this.eBj);
      if (i >= 0)
      {
        localObject = new SpannableString(((a)localObject).text);
        ((Spannable)localObject).setSpan(new ForegroundColorSpan(paramInt), i, this.eBj.length() + i, 33);
        paramViewGroup.mcp.setText((CharSequence)localObject);
      }
      else
      {
        paramViewGroup.mcp.setText(((a)localObject).text);
      }
    }
  }
  
  public final a oU(int paramInt)
  {
    GMTrace.i(12678475022336L, 94462);
    a locala = (a)this.glr.get(paramInt);
    GMTrace.o(12678475022336L, 94462);
    return locala;
  }
  
  public static final class a
  {
    public int actionType;
    public String appId;
    public String description;
    public String mck;
    public String text;
    public int type;
    
    public a()
    {
      GMTrace.i(12701560471552L, 94634);
      GMTrace.o(12701560471552L, 94634);
    }
  }
  
  private static final class b
  {
    TextView ikm;
    ViewGroup mcl;
    TextView mcm;
    TextView mcn;
    ViewGroup mco;
    TextView mcp;
    ViewGroup mcq;
    
    public b()
    {
      GMTrace.i(12773635391488L, 95171);
      GMTrace.o(12773635391488L, 95171);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */