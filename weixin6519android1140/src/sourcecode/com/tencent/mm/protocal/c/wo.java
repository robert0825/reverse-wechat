package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class wo
  extends ayx
{
  public String appId;
  public String eDJ;
  public String lro;
  public String lrp;
  public String lrq;
  public String sign;
  public String tNa;
  public int tNb;
  public ck uoJ;
  
  public wo()
  {
    GMTrace.i(3863188865024L, 28783);
    GMTrace.o(3863188865024L, 28783);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3863323082752L, 28784);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.appId != null) {
        paramVarArgs.e(2, this.appId);
      }
      if (this.lro != null) {
        paramVarArgs.e(3, this.lro);
      }
      if (this.lrp != null) {
        paramVarArgs.e(4, this.lrp);
      }
      if (this.lrq != null) {
        paramVarArgs.e(5, this.lrq);
      }
      if (this.eDJ != null) {
        paramVarArgs.e(6, this.eDJ);
      }
      if (this.sign != null) {
        paramVarArgs.e(7, this.sign);
      }
      if (this.uoJ != null)
      {
        paramVarArgs.fm(8, this.uoJ.aYq());
        this.uoJ.a(paramVarArgs);
      }
      if (this.tNa != null) {
        paramVarArgs.e(9, this.tNa);
      }
      paramVarArgs.fk(10, this.tNb);
      GMTrace.o(3863323082752L, 28784);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.appId != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.appId);
      }
      i = paramInt;
      if (this.lro != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lro);
      }
      paramInt = i;
      if (this.lrp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lrp);
      }
      i = paramInt;
      if (this.lrq != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lrq);
      }
      paramInt = i;
      if (this.eDJ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.eDJ);
      }
      i = paramInt;
      if (this.sign != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.sign);
      }
      paramInt = i;
      if (this.uoJ != null) {
        paramInt = i + b.a.a.a.fj(8, this.uoJ.aYq());
      }
      i = paramInt;
      if (this.tNa != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tNa);
      }
      paramInt = b.a.a.a.fh(10, this.tNb);
      GMTrace.o(3863323082752L, 28784);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3863323082752L, 28784);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      wo localwo = (wo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3863323082752L, 28784);
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
          localwo.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 2: 
        localwo.appId = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 3: 
        localwo.lro = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 4: 
        localwo.lrp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 5: 
        localwo.lrq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 6: 
        localwo.eDJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 7: 
        localwo.sign = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ck();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ck)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localwo.uoJ = ((ck)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 9: 
        localwo.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      }
      localwo.tNb = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3863323082752L, 28784);
      return 0;
    }
    GMTrace.o(3863323082752L, 28784);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\wo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */