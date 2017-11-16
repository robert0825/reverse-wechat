package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qd
  extends ayx
{
  public String jhi;
  public int jib;
  public String lQa;
  public int tQM;
  public long tQd;
  public int tRC;
  public int tRD;
  public int tRE;
  public String ugf;
  public String ugg;
  public int ugh;
  public int ugi;
  
  public qd()
  {
    GMTrace.i(3633005461504L, 27068);
    GMTrace.o(3633005461504L, 27068);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3633139679232L, 27069);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.fk(3, this.tQM);
      if (this.ugf != null) {
        paramVarArgs.e(4, this.ugf);
      }
      if (this.jhi != null) {
        paramVarArgs.e(5, this.jhi);
      }
      paramVarArgs.fk(6, this.tRC);
      paramVarArgs.fk(7, this.tRD);
      paramVarArgs.fk(8, this.tRE);
      if (this.ugg != null) {
        paramVarArgs.e(9, this.ugg);
      }
      paramVarArgs.fk(10, this.ugh);
      paramVarArgs.fk(11, this.jib);
      paramVarArgs.fk(12, this.ugi);
      paramVarArgs.T(13, this.tQd);
      GMTrace.o(3633139679232L, 27069);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQa);
      }
      i += b.a.a.a.fh(3, this.tQM);
      paramInt = i;
      if (this.ugf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugf);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhi);
      }
      i = i + b.a.a.a.fh(6, this.tRC) + b.a.a.a.fh(7, this.tRD) + b.a.a.a.fh(8, this.tRE);
      paramInt = i;
      if (this.ugg != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.ugg);
      }
      i = b.a.a.a.fh(10, this.ugh);
      int j = b.a.a.a.fh(11, this.jib);
      int k = b.a.a.a.fh(12, this.ugi);
      int m = b.a.a.a.S(13, this.tQd);
      GMTrace.o(3633139679232L, 27069);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3633139679232L, 27069);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qd localqd = (qd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3633139679232L, 27069);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localqd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 2: 
        localqd.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 3: 
        localqd.tQM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 4: 
        localqd.ugf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 5: 
        localqd.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 6: 
        localqd.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 7: 
        localqd.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 8: 
        localqd.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 9: 
        localqd.ugg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 10: 
        localqd.ugh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 11: 
        localqd.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      case 12: 
        localqd.ugi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3633139679232L, 27069);
        return 0;
      }
      localqd.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3633139679232L, 27069);
      return 0;
    }
    GMTrace.o(3633139679232L, 27069);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */