package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RangeWidget
  extends RelativeLayout
{
  private View hqF;
  private Activity nJy;
  private ImageView pOP;
  SnsUploadConfigView pOS;
  private String pRI;
  private String pRJ;
  private TextView pVX;
  private boolean pVY;
  int pVZ;
  String pWa;
  boolean pWb;
  public int style;
  
  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8602819493888L, 64096);
    this.pVY = true;
    this.pVZ = 0;
    this.pWa = "";
    this.pRI = "";
    this.pRJ = "";
    this.pWb = false;
    this.style = 0;
    init(paramContext);
    GMTrace.o(8602819493888L, 64096);
  }
  
  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8602685276160L, 64095);
    this.pVY = true;
    this.pVZ = 0;
    this.pWa = "";
    this.pRI = "";
    this.pRJ = "";
    this.pWb = false;
    this.style = 0;
    init(paramContext);
    GMTrace.o(8602685276160L, 64095);
  }
  
  private static List<String> ah(List<String> paramList)
  {
    GMTrace.i(8603087929344L, 64098);
    LinkedList localLinkedList = new LinkedList();
    com.tencent.mm.kernel.h.xz();
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      GMTrace.o(8603087929344L, 64098);
      return localLinkedList;
    }
    if (paramList == null)
    {
      GMTrace.o(8603087929344L, 64098);
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      com.tencent.mm.kernel.h.xz();
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str);
      paramList = str;
      if (localx != null)
      {
        paramList = str;
        if ((int)localx.fTq != 0) {
          paramList = localx.vk();
        }
      }
      localLinkedList.add(paramList);
    }
    GMTrace.o(8603087929344L, 64098);
    return localLinkedList;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8602953711616L, 64097);
    this.nJy = ((Activity)paramContext);
    this.hqF = View.inflate(paramContext, getLayoutResource(), this);
    this.pVX = ((TextView)this.hqF.findViewById(i.f.pdZ));
    this.pOP = ((ImageView)this.hqF.findViewById(i.f.pbC));
    this.hqF.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8711804289024L, 64908);
        paramAnonymousView = new Intent(RangeWidget.a(RangeWidget.this), SnsLabelUI.class);
        paramAnonymousView.putExtra("KLabel_range_index", RangeWidget.b(RangeWidget.this));
        paramAnonymousView.putExtra("Klabel_name_list", RangeWidget.c(RangeWidget.this));
        paramAnonymousView.putExtra("Kother_user_name_list", RangeWidget.d(RangeWidget.this));
        paramAnonymousView.putExtra("Ktag_rangeFilterprivate", RangeWidget.e(RangeWidget.this));
        paramAnonymousView.putExtra("k_sns_label_ui_style", RangeWidget.this.style);
        RangeWidget.a(RangeWidget.this).startActivityForResult(paramAnonymousView, 5);
        GMTrace.o(8711804289024L, 64908);
      }
    });
    GMTrace.o(8602953711616L, 64097);
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent, AtContactWidget paramAtContactWidget)
  {
    GMTrace.i(8603222147072L, 64099);
    this.pVZ = paramIntent.getIntExtra("Ktag_range_index", 0);
    this.pRI = paramIntent.getStringExtra("Klabel_name_list");
    this.pRJ = paramIntent.getStringExtra("Kother_user_name_list");
    paramInt1 = bod();
    Object localObject = "";
    if (!bg.nm(this.pRI)) {
      localObject = "" + this.pRI;
    }
    paramIntent = (Intent)localObject;
    if (!bg.nm(this.pRJ))
    {
      paramIntent = bg.c(ah(Arrays.asList(this.pRJ.split(","))), ",");
      if (((String)localObject).length() > 0) {
        paramIntent = (String)localObject + "," + paramIntent;
      }
    }
    else
    {
      localObject = paramIntent;
      if (paramInt1 != -1)
      {
        localObject = paramIntent;
        if (paramIntent != null)
        {
          localObject = paramIntent;
          if (paramIntent.length() > paramInt1) {
            localObject = paramIntent.substring(0, paramInt1) + "...";
          }
        }
      }
      paramInt1 = this.pVZ;
      if (this.pOP != null) {
        this.pOP.setImageResource(i.i.phD);
      }
      if (this.pOS != null) {
        this.pOS.jdMethod_if(false);
      }
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(8603222147072L, 64099);
      return true;
      paramIntent = (String)localObject + paramIntent;
      break;
      if (this.pOP != null) {
        this.pOP.setImageResource(i.i.phC);
      }
      this.pVX.setText(i.j.pjN);
      continue;
      if (this.pOS != null) {
        this.pOS.jdMethod_if(true);
      }
      if ((paramAtContactWidget != null) && (this.pOS != null) && (paramAtContactWidget.bmH().size() > 0))
      {
        com.tencent.mm.ui.base.h.h(this.nJy, i.j.pkK, i.j.cUG);
        paramAtContactWidget.bmI();
        this.pOS.bpK();
      }
      this.pVX.setText(i.j.pjL);
      continue;
      this.pVX.setText((CharSequence)localObject);
      continue;
      paramIntent = this.pVX;
      paramAtContactWidget = this.nJy.getString(i.j.pjz);
      localObject = paramAtContactWidget + "  " + (String)localObject;
      SpannableString localSpannableString = new SpannableString((CharSequence)localObject);
      localSpannableString.setSpan(new ForegroundColorSpan(-65536), paramAtContactWidget.length() + 2, ((String)localObject).length(), 33);
      paramIntent.setText(localSpannableString);
    }
  }
  
  protected int bod()
  {
    GMTrace.i(8603490582528L, 64101);
    GMTrace.o(8603490582528L, 64101);
    return -1;
  }
  
  protected int getLayoutResource()
  {
    GMTrace.i(8603356364800L, 64100);
    int i = i.g.peZ;
    GMTrace.o(8603356364800L, 64100);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\RangeWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */