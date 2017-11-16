package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AtContactWidget
  extends LinearLayout
{
  private View hqF;
  private Activity nJy;
  private ImageView pOP;
  private TextView pOQ;
  private PreviewContactView pOR;
  SnsUploadConfigView pOS;
  private List<String> pOT;
  private boolean pOU;
  
  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8597853437952L, 64059);
    this.pOT = new LinkedList();
    this.pOU = false;
    init(paramContext);
    GMTrace.o(8597853437952L, 64059);
  }
  
  @TargetApi(11)
  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8597719220224L, 64058);
    this.pOT = new LinkedList();
    this.pOU = false;
    init(paramContext);
    GMTrace.o(8597719220224L, 64058);
  }
  
  private void bmJ()
  {
    GMTrace.i(8598524526592L, 64064);
    if (this.pOT.size() > 0)
    {
      this.pOP.setImageResource(bmK());
      GMTrace.o(8598524526592L, 64064);
      return;
    }
    this.pOP.setImageResource(bmL());
    GMTrace.o(8598524526592L, 64064);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8598256091136L, 64062);
    this.nJy = ((Activity)paramContext);
    this.hqF = v.fb(paramContext).inflate(getLayoutResource(), this);
    this.pOR = ((PreviewContactView)this.hqF.findViewById(i.f.oZT));
    this.pOP = ((ImageView)this.hqF.findViewById(i.f.oZU));
    this.pOQ = ((TextView)this.hqF.findViewById(i.f.oZV));
    this.hqF.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8638924062720L, 64365);
        AtContactWidget.a(AtContactWidget.this);
        GMTrace.o(8638924062720L, 64365);
      }
    });
    GMTrace.o(8598256091136L, 64062);
  }
  
  public final boolean U(Intent paramIntent)
  {
    GMTrace.i(8598390308864L, 64063);
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    new LinkedList();
    if ((paramIntent == null) || (paramIntent.equals(""))) {}
    for (paramIntent = new LinkedList();; paramIntent = bg.g(paramIntent.split(",")))
    {
      if (this.pOT == null) {
        this.pOT = new LinkedList();
      }
      this.pOT.clear();
      paramIntent = paramIntent.iterator();
      while (paramIntent.hasNext())
      {
        String str = (String)paramIntent.next();
        if (!this.pOT.contains(str)) {
          this.pOT.add(str);
        }
      }
    }
    if (this.pOR != null) {
      this.pOR.bE(this.pOT);
    }
    if (this.pOU)
    {
      w.d("MicroMsg.AtContactWiget", "withList count " + this.pOT.size());
      if ((!this.pOU) || (this.pOQ == null) || (this.pOT.size() <= 0)) {
        break label297;
      }
      this.pOQ.setVisibility(0);
      if (this.pOT.size() >= 100) {
        break label284;
      }
      this.pOQ.setText(this.pOT.size());
    }
    for (;;)
    {
      bmJ();
      GMTrace.o(8598390308864L, 64063);
      return true;
      label284:
      this.pOQ.setText(i.j.efe);
      continue;
      label297:
      this.pOQ.setVisibility(8);
    }
  }
  
  public final List<String> bmH()
  {
    GMTrace.i(8597987655680L, 64060);
    if (this.pOT == null) {
      this.pOT = new LinkedList();
    }
    List localList = this.pOT;
    GMTrace.o(8597987655680L, 64060);
    return localList;
  }
  
  public final void bmI()
  {
    GMTrace.i(8598121873408L, 64061);
    if (this.pOT == null) {
      this.pOT = new LinkedList();
    }
    this.pOT.clear();
    if (this.pOR != null) {
      this.pOR.bE(this.pOT);
    }
    bmJ();
    if (this.pOQ != null) {
      this.pOQ.setVisibility(8);
    }
    GMTrace.o(8598121873408L, 64061);
  }
  
  protected int bmK()
  {
    GMTrace.i(8598792962048L, 64066);
    int i = i.i.phx;
    GMTrace.o(8598792962048L, 64066);
    return i;
  }
  
  protected int bmL()
  {
    GMTrace.i(8598927179776L, 64067);
    int i = i.i.phw;
    GMTrace.o(8598927179776L, 64067);
    return i;
  }
  
  protected int getLayoutResource()
  {
    GMTrace.i(8598658744320L, 64065);
    int i = i.g.oZW;
    GMTrace.o(8598658744320L, 64065);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\AtContactWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */