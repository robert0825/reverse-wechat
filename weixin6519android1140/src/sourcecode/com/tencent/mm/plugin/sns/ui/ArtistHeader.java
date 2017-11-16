package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.k;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.do;
import com.tencent.mm.protocal.c.dp;
import com.tencent.mm.ui.base.k;

public class ArtistHeader
  extends LinearLayout
  implements b.b
{
  Context context;
  private k llJ;
  private View npf;
  do pOo;
  a pOt;
  private ImageView pOu;
  private ProgressBar pOv;
  
  public ArtistHeader(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8668854616064L, 64588);
    this.pOo = null;
    this.llJ = null;
    this.context = null;
    init(paramContext);
    GMTrace.o(8668854616064L, 64588);
  }
  
  public ArtistHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8668988833792L, 64589);
    this.pOo = null;
    this.llJ = null;
    this.context = null;
    init(paramContext);
    GMTrace.o(8668988833792L, 64589);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8669123051520L, 64590);
    View localView = LayoutInflater.from(paramContext).inflate(i.g.pfu, this, true);
    this.context = paramContext;
    this.pOt = new a();
    this.pOt.hqg = ((ImageView)localView.findViewById(i.f.oZR));
    this.pOt.mrx = ((TextView)localView.findViewById(i.f.oYB));
    this.pOt.pOy = ((TextView)localView.findViewById(i.f.oYE));
    this.pOt.pOz = ((TextView)localView.findViewById(i.f.oYC));
    this.pOt.hqi = ((TextView)localView.findViewById(i.f.oYD));
    this.pOt.hqg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8354382479360L, 62245);
        if ((ArtistHeader.a(ArtistHeader.this) != null) && (ArtistHeader.a(ArtistHeader.this).isShowing()))
        {
          GMTrace.o(8354382479360L, 62245);
          return;
        }
        if (ArtistHeader.b(ArtistHeader.this) == null)
        {
          GMTrace.o(8354382479360L, 62245);
          return;
        }
        paramAnonymousView = LayoutInflater.from(ArtistHeader.this.getContext()).inflate(i.g.kbz, null);
        ArtistHeader.a(ArtistHeader.this, new k(ArtistHeader.this.getContext(), i.k.plq));
        paramAnonymousView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            GMTrace.i(8389950177280L, 62510);
            ArtistHeader.a(ArtistHeader.this).dismiss();
            GMTrace.o(8389950177280L, 62510);
          }
        });
        ArtistHeader.a(ArtistHeader.this).setCanceledOnTouchOutside(true);
        ArtistHeader.a(ArtistHeader.this).setContentView(paramAnonymousView);
        ArtistHeader.a(ArtistHeader.this).show();
        ArtistHeader.a(ArtistHeader.this, (ImageView)paramAnonymousView.findViewById(i.f.kbq));
        ArtistHeader.a(ArtistHeader.this, (ProgressBar)paramAnonymousView.findViewById(i.f.kbr));
        ArtistHeader.a(ArtistHeader.this, paramAnonymousView.findViewById(i.f.kbs));
        GMTrace.o(8354382479360L, 62245);
      }
    });
    GMTrace.o(8669123051520L, 64590);
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8669257269248L, 64591);
    GMTrace.o(8669257269248L, 64591);
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8669391486976L, 64592);
    if (this.pOo == null)
    {
      GMTrace.o(8669391486976L, 64592);
      return;
    }
    if ((this.llJ != null) && (this.llJ.isShowing()) && (!paramBoolean))
    {
      anu localanu = this.pOo.tRQ.tRR;
      if ((localanu.mmR != null) && (localanu.mmR.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(i.j.piT), 0).show();
        GMTrace.o(8669391486976L, 64592);
        return;
      }
    }
    GMTrace.o(8669391486976L, 64592);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8669525704704L, 64593);
    GMTrace.o(8669525704704L, 64593);
  }
  
  public final void bhV()
  {
    GMTrace.i(8669659922432L, 64594);
    GMTrace.o(8669659922432L, 64594);
  }
  
  final class a
  {
    ImageView hqg;
    TextView hqi;
    TextView mrx;
    TextView pOy;
    TextView pOz;
    
    a()
    {
      GMTrace.i(8427262705664L, 62788);
      GMTrace.o(8427262705664L, 62788);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ArtistHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */