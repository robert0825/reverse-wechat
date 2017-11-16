package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class uy
  extends azh
{
  public String eBt;
  public LinkedList<String> unh;
  public String uni;
  public LinkedList<String> unj;
  public LinkedList<String> unk;
  public LinkedList<uz> unl;
  
  public uy()
  {
    GMTrace.i(3969355087872L, 29574);
    this.unh = new LinkedList();
    this.unj = new LinkedList();
    this.unk = new LinkedList();
    this.unl = new LinkedList();
    GMTrace.o(3969355087872L, 29574);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3969489305600L, 29575);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.uni == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      paramVarArgs.d(3, 1, this.unh);
      if (this.uni != null) {
        paramVarArgs.e(4, this.uni);
      }
      paramVarArgs.d(5, 1, this.unj);
      paramVarArgs.d(6, 1, this.unk);
      paramVarArgs.d(7, 8, this.unl);
      GMTrace.o(3969489305600L, 29575);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eBt);
      }
      i += b.a.a.a.c(3, 1, this.unh);
      paramInt = i;
      if (this.uni != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uni);
      }
      i = b.a.a.a.c(5, 1, this.unj);
      int j = b.a.a.a.c(6, 1, this.unk);
      int k = b.a.a.a.c(7, 8, this.unl);
      GMTrace.o(3969489305600L, 29575);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.unh.clear();
      this.unj.clear();
      this.unk.clear();
      this.unl.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.uni == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      GMTrace.o(3969489305600L, 29575);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      uy localuy = (uy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3969489305600L, 29575);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localuy.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 2: 
        localuy.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 3: 
        localuy.unh.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 4: 
        localuy.uni = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 5: 
        localuy.unj.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3969489305600L, 29575);
        return 0;
      case 6: 
        localuy.unk.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3969489305600L, 29575);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new uz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((uz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localuy.unl.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3969489305600L, 29575);
      return 0;
    }
    GMTrace.o(3969489305600L, 29575);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\uy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */