package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ei
  extends com.tencent.mm.bm.a
{
  public String ID;
  public int tST;
  public azp tSU;
  public String tSV;
  public int tSW;
  
  public ei()
  {
    GMTrace.i(3859699204096L, 28757);
    GMTrace.o(3859699204096L, 28757);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3859833421824L, 28758);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSU == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      paramVarArgs.fk(1, this.tST);
      if (this.tSU != null)
      {
        paramVarArgs.fm(2, this.tSU.aYq());
        this.tSU.a(paramVarArgs);
      }
      if (this.tSV != null) {
        paramVarArgs.e(3, this.tSV);
      }
      paramVarArgs.fk(4, this.tSW);
      if (this.ID != null) {
        paramVarArgs.e(5, this.ID);
      }
      GMTrace.o(3859833421824L, 28758);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0;
      paramInt = i;
      if (this.tSU != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSU.aYq());
      }
      i = paramInt;
      if (this.tSV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSV);
      }
      i += b.a.a.a.fh(4, this.tSW);
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ID);
      }
      GMTrace.o(3859833421824L, 28758);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tSU == null) {
        throw new b("Not all required fields were included: QRCodeBuffer");
      }
      GMTrace.o(3859833421824L, 28758);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ei localei = (ei)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3859833421824L, 28758);
        return -1;
      case 1: 
        localei.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3859833421824L, 28758);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localei.tSU = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3859833421824L, 28758);
        return 0;
      case 3: 
        localei.tSV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3859833421824L, 28758);
        return 0;
      case 4: 
        localei.tSW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3859833421824L, 28758);
        return 0;
      }
      localei.ID = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3859833421824L, 28758);
      return 0;
    }
    GMTrace.o(3859833421824L, 28758);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */