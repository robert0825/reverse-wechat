package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class awx
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  public int uJl;
  public String uhb;
  public String ujf;
  public String uoe;
  
  public awx()
  {
    GMTrace.i(3961570459648L, 29516);
    GMTrace.o(3961570459648L, 29516);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3961704677376L, 29517);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      paramVarArgs.fk(2, this.uJl);
      if (this.jio != null) {
        paramVarArgs.e(3, this.jio);
      }
      if (this.uhb != null) {
        paramVarArgs.e(4, this.uhb);
      }
      if (this.ujf != null) {
        paramVarArgs.e(5, this.ujf);
      }
      if (this.uoe != null) {
        paramVarArgs.e(6, this.uoe);
      }
      GMTrace.o(3961704677376L, 29517);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label550;
      }
    }
    label550:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uJl);
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jio);
      }
      i = paramInt;
      if (this.uhb != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uhb);
      }
      paramInt = i;
      if (this.ujf != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ujf);
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uoe);
      }
      GMTrace.o(3961704677376L, 29517);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3961704677376L, 29517);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        awx localawx = (awx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3961704677376L, 29517);
          return -1;
        case 1: 
          localawx.jhi = locala.yqV.readString();
          GMTrace.o(3961704677376L, 29517);
          return 0;
        case 2: 
          localawx.uJl = locala.yqV.nj();
          GMTrace.o(3961704677376L, 29517);
          return 0;
        case 3: 
          localawx.jio = locala.yqV.readString();
          GMTrace.o(3961704677376L, 29517);
          return 0;
        case 4: 
          localawx.uhb = locala.yqV.readString();
          GMTrace.o(3961704677376L, 29517);
          return 0;
        case 5: 
          localawx.ujf = locala.yqV.readString();
          GMTrace.o(3961704677376L, 29517);
          return 0;
        }
        localawx.uoe = locala.yqV.readString();
        GMTrace.o(3961704677376L, 29517);
        return 0;
      }
      GMTrace.o(3961704677376L, 29517);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\awx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */