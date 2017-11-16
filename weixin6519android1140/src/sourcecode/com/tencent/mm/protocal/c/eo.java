package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class eo
  extends com.tencent.mm.bm.a
{
  public String mhU;
  public String nDt;
  public String ojk;
  public int ojl;
  public int ojm;
  public String ojn;
  public String ojo;
  public String ojp;
  public LinkedList<rp> tTs;
  public String yvC;
  
  public eo()
  {
    GMTrace.i(20864414253056L, 155452);
    this.tTs = new LinkedList();
    GMTrace.o(20864414253056L, 155452);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20864548470784L, 155453);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nDt != null) {
        paramVarArgs.e(1, this.nDt);
      }
      if (this.mhU != null) {
        paramVarArgs.e(2, this.mhU);
      }
      if (this.ojk != null) {
        paramVarArgs.e(3, this.ojk);
      }
      paramVarArgs.fk(4, this.ojl);
      paramVarArgs.fk(5, this.ojm);
      paramVarArgs.d(6, 8, this.tTs);
      if (this.ojn != null) {
        paramVarArgs.e(7, this.ojn);
      }
      if (this.ojo != null) {
        paramVarArgs.e(8, this.ojo);
      }
      if (this.ojp != null) {
        paramVarArgs.e(9, this.ojp);
      }
      if (this.yvC != null) {
        paramVarArgs.e(10, this.yvC);
      }
      GMTrace.o(20864548470784L, 155453);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.nDt != null) {
        i = b.a.a.b.b.a.f(1, this.nDt) + 0;
      }
      paramInt = i;
      if (this.mhU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mhU);
      }
      i = paramInt;
      if (this.ojk != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ojk);
      }
      i = i + b.a.a.a.fh(4, this.ojl) + b.a.a.a.fh(5, this.ojm) + b.a.a.a.c(6, 8, this.tTs);
      paramInt = i;
      if (this.ojn != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ojn);
      }
      i = paramInt;
      if (this.ojo != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.ojo);
      }
      paramInt = i;
      if (this.ojp != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.ojp);
      }
      i = paramInt;
      if (this.yvC != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.yvC);
      }
      GMTrace.o(20864548470784L, 155453);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTs.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20864548470784L, 155453);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      eo localeo = (eo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20864548470784L, 155453);
        return -1;
      case 1: 
        localeo.nDt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 2: 
        localeo.mhU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 3: 
        localeo.ojk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 4: 
        localeo.ojl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 5: 
        localeo.ojm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((rp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localeo.tTs.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 7: 
        localeo.ojn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 8: 
        localeo.ojo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      case 9: 
        localeo.ojp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20864548470784L, 155453);
        return 0;
      }
      localeo.yvC = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20864548470784L, 155453);
      return 0;
    }
    GMTrace.o(20864548470784L, 155453);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */