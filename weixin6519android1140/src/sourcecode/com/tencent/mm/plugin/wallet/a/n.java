package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class n
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String id;
  public String name;
  public String qXV;
  public String qXW;
  public String qXX;
  public String qXY;
  public int qXZ;
  public int status;
  public int type;
  public String url;
  
  public n()
  {
    GMTrace.i(7698192007168L, 57356);
    this.qXX = "0";
    this.qXY = "0";
    this.qXZ = 0;
    GMTrace.o(7698192007168L, 57356);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7698326224896L, 57357);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.e(1, this.id);
      }
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      if (this.desc != null) {
        paramVarArgs.e(3, this.desc);
      }
      paramVarArgs.fk(4, this.status);
      if (this.url != null) {
        paramVarArgs.e(5, this.url);
      }
      paramVarArgs.fk(6, this.type);
      if (this.qXV != null) {
        paramVarArgs.e(7, this.qXV);
      }
      if (this.qXW != null) {
        paramVarArgs.e(8, this.qXW);
      }
      if (this.qXX != null) {
        paramVarArgs.e(9, this.qXX);
      }
      if (this.qXY != null) {
        paramVarArgs.e(10, this.qXY);
      }
      paramVarArgs.fk(11, this.qXZ);
      GMTrace.o(7698326224896L, 57357);
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label829;
      }
    }
    label829:
    for (int i = b.a.a.b.b.a.f(1, this.id) + 0;; i = 0)
    {
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.desc);
      }
      i += b.a.a.a.fh(4, this.status);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.url);
      }
      i = paramInt + b.a.a.a.fh(6, this.type);
      paramInt = i;
      if (this.qXV != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.qXV);
      }
      i = paramInt;
      if (this.qXW != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.qXW);
      }
      paramInt = i;
      if (this.qXX != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.qXX);
      }
      i = paramInt;
      if (this.qXY != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.qXY);
      }
      paramInt = b.a.a.a.fh(11, this.qXZ);
      GMTrace.o(7698326224896L, 57357);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(7698326224896L, 57357);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(7698326224896L, 57357);
          return -1;
        case 1: 
          localn.id = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 2: 
          localn.name = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 3: 
          localn.desc = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 4: 
          localn.status = locala.yqV.nj();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 5: 
          localn.url = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 6: 
          localn.type = locala.yqV.nj();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 7: 
          localn.qXV = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 8: 
          localn.qXW = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 9: 
          localn.qXX = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        case 10: 
          localn.qXY = locala.yqV.readString();
          GMTrace.o(7698326224896L, 57357);
          return 0;
        }
        localn.qXZ = locala.yqV.nj();
        GMTrace.o(7698326224896L, 57357);
        return 0;
      }
      GMTrace.o(7698326224896L, 57357);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */