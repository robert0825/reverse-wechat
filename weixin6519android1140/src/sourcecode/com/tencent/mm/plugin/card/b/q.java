package com.tencent.mm.plugin.card.b;

import com.tencent.gmtrace.GMTrace;

public enum q
{
  public int scene;
  
  static
  {
    GMTrace.i(18905506512896L, 140857);
    jLx = new q("EN_DYNAMIC_CODE_SCENE_ENTER_FOREGROUND", 0, 1);
    jLy = new q("EN_DYNAMIC_CODE_SCENE_ENTER_WXCARD", 1, 2);
    jLz = new q("EN_DYNAMIC_CODE_SCENE_ENTER_CARD_DETAIL", 2, 3);
    jLA = new q[] { jLx, jLy, jLz };
    GMTrace.o(18905506512896L, 140857);
  }
  
  private q(int paramInt)
  {
    GMTrace.i(18905372295168L, 140856);
    this.scene = paramInt;
    GMTrace.o(18905372295168L, 140856);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */