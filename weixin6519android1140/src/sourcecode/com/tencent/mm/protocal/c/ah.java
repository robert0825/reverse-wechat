package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ah
  extends ayx
{
  public String eTJ;
  public String eTK;
  public int eTL;
  public String jyR;
  public String tNH;
  public String tNI;
  public int tNJ;
  public int tNK;
  public bhb tNL;
  
  public ah()
  {
    GMTrace.i(3716623106048L, 27691);
    GMTrace.o(3716623106048L, 27691);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3716757323776L, 27692);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jyR != null) {
        paramVarArgs.e(2, this.jyR);
      }
      paramVarArgs.fk(3, this.eTL);
      if (this.eTJ != null) {
        paramVarArgs.e(4, this.eTJ);
      }
      if (this.eTK != null) {
        paramVarArgs.e(5, this.eTK);
      }
      if (this.tNH != null) {
        paramVarArgs.e(6, this.tNH);
      }
      if (this.tNI != null) {
        paramVarArgs.e(7, this.tNI);
      }
      paramVarArgs.fk(8, this.tNJ);
      paramVarArgs.fk(9, this.tNK);
      if (this.tNL != null)
      {
        paramVarArgs.fm(10, this.tNL.aYq());
        this.tNL.a(paramVarArgs);
      }
      GMTrace.o(3716757323776L, 27692);
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
      if (this.jyR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jyR);
      }
      i += b.a.a.a.fh(3, this.eTL);
      paramInt = i;
      if (this.eTJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.eTJ);
      }
      i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.eTK);
      }
      paramInt = i;
      if (this.tNH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tNH);
      }
      i = paramInt;
      if (this.tNI != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tNI);
      }
      i = i + b.a.a.a.fh(8, this.tNJ) + b.a.a.a.fh(9, this.tNK);
      paramInt = i;
      if (this.tNL != null) {
        paramInt = i + b.a.a.a.fj(10, this.tNL.aYq());
      }
      GMTrace.o(3716757323776L, 27692);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.eTJ == null) {
        throw new b("Not all required fields were included: card_id");
      }
      GMTrace.o(3716757323776L, 27692);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ah localah = (ah)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3716757323776L, 27692);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localah.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 2: 
        localah.jyR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 3: 
        localah.eTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 4: 
        localah.eTJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 5: 
        localah.eTK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 6: 
        localah.tNH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 7: 
        localah.tNI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 8: 
        localah.tNJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      case 9: 
        localah.tNK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3716757323776L, 27692);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localah.tNL = ((bhb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3716757323776L, 27692);
      return 0;
    }
    GMTrace.o(3716757323776L, 27692);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */