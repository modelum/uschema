package es.um.unosql.utils.compare;

import es.um.unosql.uNoSQLSchema.DataType;
import es.um.unosql.uNoSQLSchema.Null;
import es.um.unosql.uNoSQLSchema.PList;
import es.um.unosql.uNoSQLSchema.PMap;
import es.um.unosql.uNoSQLSchema.PSet;
import es.um.unosql.uNoSQLSchema.PTuple;
import es.um.unosql.uNoSQLSchema.PrimitiveType;

public class CompareDataType extends Comparator<DataType>
{
  @Override
  public boolean compare(DataType t1, DataType t2)
  {
    if (super.checkNulls(t1, t2))
      return false;

    if (super.checkEquals(t1, t2))
      return true;

    if (t1 instanceof Null && t2 instanceof Null)
      return new CompareNull().compare((Null)t1, (Null)t2);

    if (t1 instanceof PrimitiveType && t2 instanceof PrimitiveType)
      return new ComparePrimitiveType().compare((PrimitiveType)t1, (PrimitiveType)t2);

    if (t1 instanceof PMap && t2 instanceof PMap)
      return new ComparePMap().compare((PMap)t1, (PMap)t2);

    if (t1 instanceof PTuple && t2 instanceof PTuple)
      return new ComparePTuple().compare((PTuple)t1, (PTuple)t2);

    if (t1 instanceof PList && t2 instanceof PList)
      return new ComparePList().compare((PList)t1, (PList)t2);

    if (t1 instanceof PSet && t2 instanceof PSet)
      return new ComparePSet().compare((PSet)t1, (PSet)t2);

    return false;
  }
}
