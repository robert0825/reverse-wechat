package com.tencent.mm.plugin.card.b;

import com.tencent.gmtrace.GMTrace;

public enum c
{
  public int action;
  
  static
  {
    GMTrace.i(18906177601536L, 140862);
    jLc = new c("CARDCODEREFRESHACTION_UNSHOWN_TIMEOUT", 0, 0);
    jLd = new c("CARDCODEREFRESHACTION_SHOWING_TIMEOUT", 1, 1);
    jLe = new c("CARDCODEREFRESHACTION_SNAPSHOT", 2, 2);
    jLf = new c("CARDCODEREFRESHACTION_DOREFRESH", 3, 3);
    jLg = new c("CARDCODEREFRESHACTION_ENTERFOREGROUND", 4, 4);
    jLh = new c("CARDCODEREFRESHACTION_BANCODE", 5, 5);
    jLi = new c("CARDCODEREFRESHACTION_UPDATECHANGE", 6, 6);
    jLj = new c("CARDCODEREFRESHACTION_ENTERCHANGE", 7, 7);
    jLk = new c[] { jLc, jLd, jLe, jLf, jLg, jLh, jLi, jLj };
    GMTrace.o(18906177601536L, 140862);
  }
  
  private c(int paramInt)
  {
    GMTrace.i(18906043383808L, 140861);
    this.action = 0;
    this.action = paramInt;
    GMTrace.o(18906043383808L, 140861);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */