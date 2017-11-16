package com.tencent.mm.ui.bindgooglecontact;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.p;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ui.o<com.tencent.mm.modelfriend.o>
{
  private Context mContext;
  private String mFilter;
  private LayoutInflater mLayoutInflater;
  private String wlL;
  a wme;
  
  public a(Context paramContext, String paramString)
  {
    super(paramContext, new com.tencent.mm.modelfriend.o());
    GMTrace.i(1677721600000L, 12500);
    this.wlL = paramString;
    this.mContext = paramContext;
    this.mLayoutInflater = LayoutInflater.from(this.mContext);
    GMTrace.o(1677721600000L, 12500);
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(1678124253184L, 12503);
    this.mFilter = bg.nk(paramString);
    aJe();
    QF();
    GMTrace.o(1678124253184L, 12503);
  }
  
  public final void QF()
  {
    GMTrace.i(1677990035456L, 12502);
    p localp = af.In();
    String str1 = this.mFilter;
    String str2 = this.wlL;
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(str1))
    {
      localStringBuilder.append(" WHERE ( ");
      localStringBuilder.append("GoogleFriend.googlegmail!='" + str2 + "' AND ");
      localStringBuilder.append("GoogleFriend.googlename LIKE '%" + str1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.googlenamepy LIKE '%" + str1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.googlegmail LIKE '%" + str1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.nickname LIKE '%" + str1 + "%' ) ");
    }
    for (;;)
    {
      localStringBuilder.append(" GROUP BY googleid,contecttype");
      localStringBuilder.append(" ORDER BY status , googlenamepy ASC , usernamepy ASC");
      setCursor(localp.fTZ.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + localStringBuilder.toString(), null));
      super.notifyDataSetChanged();
      GMTrace.o(1677990035456L, 12502);
      return;
      localStringBuilder.append(" WHERE ( GoogleFriend.googlegmail!='" + str2 + "' )");
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(1677855817728L, 12501);
    QF();
    GMTrace.o(1677855817728L, 12501);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(1678258470912L, 12504);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = this.mLayoutInflater.inflate(R.i.czB, null);
      paramViewGroup = new b(paramView);
      paramView.setTag(paramViewGroup);
    }
    com.tencent.mm.modelfriend.o localo;
    for (;;)
    {
      localo = (com.tencent.mm.modelfriend.o)getItem(paramInt);
      if (localo != null) {
        break;
      }
      GMTrace.o(1678258470912L, 12504);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
    }
    paramViewGroup.position = paramInt;
    paramViewGroup.nNN = localo.field_googlegmail;
    switch (localo.field_status)
    {
    default: 
      if (TextUtils.isEmpty(localo.field_googlename))
      {
        paramViewGroup.hvQ.setText(bg.SI(localo.field_googlegmail));
        switch (localo.field_status)
        {
        default: 
          switch (localo.field_googlecgistatus)
          {
          default: 
            paramViewGroup.wmf.setText(localo.field_googlegmail);
            GMTrace.o(1678258470912L, 12504);
            return paramView;
          }
          break;
        }
      }
      break;
    case 0: 
    case 2: 
      label154:
      label184:
      label216:
      if (localo.field_small_url == null) {}
      break;
    }
    for (Bitmap localBitmap = b.a(localo.field_username, false, -1);; localBitmap = null)
    {
      if (localBitmap == null)
      {
        paramViewGroup.hqg.setImageDrawable(com.tencent.mm.br.a.b(this.mContext, R.k.aVS));
        break;
      }
      paramViewGroup.hqg.setImageBitmap(localBitmap);
      break;
      localBitmap = b.hJ(localo.field_googleid);
      if (localBitmap == null)
      {
        paramViewGroup.hqg.setImageDrawable(com.tencent.mm.br.a.b(this.mContext, R.k.aVS));
        break;
      }
      paramViewGroup.hqg.setImageBitmap(localBitmap);
      break;
      paramViewGroup.hvQ.setText(localo.field_googlename);
      break label154;
      paramViewGroup.wmg.setClickable(true);
      paramViewGroup.wmg.setBackgroundResource(R.g.aUF);
      paramViewGroup.hql.setText(R.l.dAS);
      paramViewGroup.hql.setTextColor(this.mContext.getResources().getColor(R.e.white));
      break label184;
      paramViewGroup.wmg.setClickable(true);
      paramViewGroup.wmg.setBackgroundResource(R.g.aUG);
      paramViewGroup.hql.setText(R.l.dBa);
      paramViewGroup.hql.setTextColor(this.mContext.getResources().getColor(R.e.aOl));
      break label184;
      paramViewGroup.wmg.setClickable(false);
      paramViewGroup.wmg.setBackgroundDrawable(null);
      paramViewGroup.hql.setText(R.l.dAU);
      paramViewGroup.hql.setTextColor(this.mContext.getResources().getColor(R.e.aOl));
      break label184;
      paramViewGroup.hql.setVisibility(4);
      paramViewGroup.wmh.setVisibility(0);
      break label216;
      paramViewGroup.wmg.setClickable(false);
      paramViewGroup.wmg.setBackgroundDrawable(null);
      paramViewGroup.hql.setVisibility(0);
      paramViewGroup.wmh.setVisibility(8);
      paramViewGroup.hql.setTextColor(this.mContext.getResources().getColor(R.e.aOl));
      switch (localo.field_status)
      {
      default: 
        break;
      case 0: 
        paramViewGroup.hql.setText(R.l.dAT);
        break;
      case 1: 
        paramViewGroup.hql.setText(R.l.dBb);
        break;
        paramViewGroup.hql.setVisibility(0);
        paramViewGroup.wmh.setVisibility(8);
        switch (localo.field_status)
        {
        default: 
          break;
        case 0: 
          paramViewGroup.hql.setText(R.l.dAS);
          paramViewGroup.hql.setTextColor(this.mContext.getResources().getColor(R.e.white));
          break;
        case 1: 
          paramViewGroup.hql.setText(R.l.dBa);
          paramViewGroup.hql.setTextColor(this.mContext.getResources().getColor(R.e.aOl));
          break;
        }
        break;
      }
    }
  }
  
  static abstract interface a
  {
    public abstract void Cx(int paramInt);
  }
  
  final class b
  {
    ImageView hqg;
    TextView hql;
    TextView hvQ;
    String nNN;
    int position;
    TextView wmf;
    View wmg;
    ProgressBar wmh;
    
    public b(View paramView)
    {
      GMTrace.i(1667521052672L, 12424);
      this.hqg = ((ImageView)paramView.findViewById(R.h.bFf));
      this.hvQ = ((TextView)paramView.findViewById(R.h.bFj));
      this.wmg = paramView.findViewById(R.h.bFk);
      this.hql = ((TextView)paramView.findViewById(R.h.bFl));
      this.wmh = ((ProgressBar)paramView.findViewById(R.h.bFi));
      this.wmf = ((TextView)paramView.findViewById(R.h.bFg));
      this.wmg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1670473842688L, 12446);
          w.d("MicroMsg.GoogleContact.GoogleFriendAdapter", "onClick");
          if (a.a(a.this) != null) {
            a.a(a.this).Cx(a.b.this.position);
          }
          GMTrace.o(1670473842688L, 12446);
        }
      });
      GMTrace.o(1667521052672L, 12424);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\bindgooglecontact\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */