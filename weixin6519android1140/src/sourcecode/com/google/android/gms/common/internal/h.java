package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.signin.e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class h
{
  public final Account afv;
  public final Set<Scope> agQ;
  private final int agR;
  private final View agS;
  public final String agT;
  final String agU;
  final Set<Scope> akK;
  public final Map<a<?>, a> akL;
  public final e akM;
  public Integer akN;
  
  public h(Account paramAccount, Set<Scope> paramSet, Map<a<?>, a> paramMap, int paramInt, View paramView, String paramString1, String paramString2, e parame)
  {
    this.afv = paramAccount;
    if (paramSet == null) {}
    for (paramAccount = Collections.EMPTY_SET;; paramAccount = Collections.unmodifiableSet(paramSet))
    {
      this.agQ = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null) {
        paramAccount = Collections.EMPTY_MAP;
      }
      this.akL = paramAccount;
      this.agS = paramView;
      this.agR = paramInt;
      this.agT = paramString1;
      this.agU = paramString2;
      this.akM = parame;
      paramAccount = new HashSet(this.agQ);
      paramSet = this.akL.values().iterator();
      while (paramSet.hasNext()) {
        paramAccount.addAll(((a)paramSet.next()).ahk);
      }
    }
    this.akK = Collections.unmodifiableSet(paramAccount);
  }
  
  public static final class a
  {
    public final Set<Scope> ahk;
    public final boolean akO;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */